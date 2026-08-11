package com.education.item.icebomb;

import com.education.entity.icebomb.ThrownIceBombEntity;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.Entity;

public class IceBombItem extends Item {

   public IceBombItem(Properties properties) {
        super(properties);
   }

   @Override
   public InteractionResult use(final Level level, final Player player, final InteractionHand hand) {
      ItemStack itemStack = player.getItemInHand(hand);
      level.playSound((Entity)null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENDER_PEARL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
      if (level instanceof ServerLevel serverLevel) {
         Projectile.spawnProjectileFromRotation(ThrownIceBombEntity::new, serverLevel, itemStack, player, 0.0F, 1.5F, 1.0F);
      }

      player.awardStat(Stats.ITEM_USED.get(this));
      itemStack.consume(1, player);
      return InteractionResult.SUCCESS;
   }
}
