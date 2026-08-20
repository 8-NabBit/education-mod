package com.education.block;
import java.util.function.Function;

import com.education.JavaEducation;
import com.education.block.HeatBlock.HeatBlock;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;


public class ModBlocks {
    public static final Block HEAT_BLOCK = registerBlock("heat_block", properties -> new HeatBlock(properties.strength(2.5f)
        .requiresCorrectToolForDrops().sound(SoundType.STONE).randomTicks().noOcclusion()));

    public static final Block ELEMENT_UNKNOWN = registerBlock("element_unknown", properties -> new Block(properties));
    public static final Block ELEMENT_H =  registerBlock("element_h",  properties -> new Block(properties));
    public static final Block ELEMENT_HE = registerBlock("element_he", properties -> new Block(properties));
    public static final Block ELEMENT_LI = registerBlock("element_li", properties -> new Block(properties));
    public static final Block ELEMENT_BE = registerBlock("element_be", properties -> new Block(properties));
    public static final Block ELEMENT_B =  registerBlock("element_b",  properties -> new Block(properties));
    public static final Block ELEMENT_C =  registerBlock("element_c",  properties -> new Block(properties));
    public static final Block ELEMENT_N =  registerBlock("element_n",  properties -> new Block(properties));
    public static final Block ELEMENT_O =  registerBlock("element_o",  properties -> new Block(properties));
    public static final Block ELEMENT_F =  registerBlock("element_f",  properties -> new Block(properties));
    public static final Block ELEMENT_NE = registerBlock("element_ne", properties -> new Block(properties));
    public static final Block ELEMENT_NA = registerBlock("element_na", properties -> new Block(properties));
    public static final Block ELEMENT_MG = registerBlock("element_mg", properties -> new Block(properties));
    public static final Block ELEMENT_AL = registerBlock("element_al", properties -> new Block(properties));
    public static final Block ELEMENT_SI = registerBlock("element_si", properties -> new Block(properties));
    public static final Block ELEMENT_P =  registerBlock("element_p",  properties -> new Block(properties));
    public static final Block ELEMENT_S =  registerBlock("element_s",  properties -> new Block(properties));
    public static final Block ELEMENT_CL = registerBlock("element_cl", properties -> new Block(properties));
    public static final Block ELEMENT_AR = registerBlock("element_ar", properties -> new Block(properties));
    public static final Block ELEMENT_K =  registerBlock("element_k",  properties -> new Block(properties));
    public static final Block ELEMENT_CA = registerBlock("element_ca", properties -> new Block(properties));
    public static final Block ELEMENT_SC = registerBlock("element_sc", properties -> new Block(properties));
    public static final Block ELEMENT_TI = registerBlock("element_ti", properties -> new Block(properties));
    public static final Block ELEMENT_V =  registerBlock("element_v",  properties -> new Block(properties));
    public static final Block ELEMENT_CR = registerBlock("element_cr", properties -> new Block(properties));
    public static final Block ELEMENT_MN = registerBlock("element_mn", properties -> new Block(properties));
    public static final Block ELEMENT_FE = registerBlock("element_fe", properties -> new Block(properties));
    public static final Block ELEMENT_CO = registerBlock("element_co", properties -> new Block(properties));
    public static final Block ELEMENT_NI = registerBlock("element_ni", properties -> new Block(properties));
    public static final Block ELEMENT_CU = registerBlock("element_cu", properties -> new Block(properties));
    public static final Block ELEMENT_ZN = registerBlock("element_zn", properties -> new Block(properties));
    public static final Block ELEMENT_GA = registerBlock("element_ga", properties -> new Block(properties));
    public static final Block ELEMENT_GE = registerBlock("element_ge", properties -> new Block(properties));
    public static final Block ELEMENT_AS = registerBlock("element_as", properties -> new Block(properties));
    public static final Block ELEMENT_SE = registerBlock("element_se", properties -> new Block(properties));
    public static final Block ELEMENT_BR = registerBlock("element_br", properties -> new Block(properties));
    public static final Block ELEMENT_KR = registerBlock("element_kr", properties -> new Block(properties));
    public static final Block ELEMENT_RB = registerBlock("element_rb", properties -> new Block(properties));
    public static final Block ELEMENT_SR = registerBlock("element_sr", properties -> new Block(properties));
    public static final Block ELEMENT_Y =  registerBlock("element_y",  properties -> new Block(properties));
    public static final Block ELEMENT_ZR = registerBlock("element_zr", properties -> new Block(properties));
    public static final Block ELEMENT_NB = registerBlock("element_nb", properties -> new Block(properties));
    public static final Block ELEMENT_MO = registerBlock("element_mo", properties -> new Block(properties));
    public static final Block ELEMENT_TC = registerBlock("element_tc", properties -> new Block(properties));
    public static final Block ELEMENT_RU = registerBlock("element_ru", properties -> new Block(properties));
    public static final Block ELEMENT_RH = registerBlock("element_rh", properties -> new Block(properties));
    public static final Block ELEMENT_PD = registerBlock("element_pd", properties -> new Block(properties));
    public static final Block ELEMENT_AG = registerBlock("element_ag", properties -> new Block(properties));
    public static final Block ELEMENT_CD = registerBlock("element_cd", properties -> new Block(properties));
    public static final Block ELEMENT_IN = registerBlock("element_in", properties -> new Block(properties));
    public static final Block ELEMENT_SN = registerBlock("element_sn", properties -> new Block(properties));
    public static final Block ELEMENT_SB = registerBlock("element_sb", properties -> new Block(properties));
    public static final Block ELEMENT_TE = registerBlock("element_te", properties -> new Block(properties));
    public static final Block ELEMENT_I =  registerBlock("element_i",  properties -> new Block(properties));
    public static final Block ELEMENT_XE = registerBlock("element_xe", properties -> new Block(properties));
    public static final Block ELEMENT_CS = registerBlock("element_cs", properties -> new Block(properties));
    public static final Block ELEMENT_BA = registerBlock("element_ba", properties -> new Block(properties));
    public static final Block ELEMENT_LA = registerBlock("element_la", properties -> new Block(properties));
    public static final Block ELEMENT_CE = registerBlock("element_ce", properties -> new Block(properties));
    public static final Block ELEMENT_PR = registerBlock("element_pr", properties -> new Block(properties));
    public static final Block ELEMENT_ND = registerBlock("element_nd", properties -> new Block(properties));
    public static final Block ELEMENT_PM = registerBlock("element_pm", properties -> new Block(properties));
    public static final Block ELEMENT_SM = registerBlock("element_sm", properties -> new Block(properties));
    public static final Block ELEMENT_EU = registerBlock("element_eu", properties -> new Block(properties));
    public static final Block ELEMENT_GD = registerBlock("element_gd", properties -> new Block(properties));
    public static final Block ELEMENT_TB = registerBlock("element_tb", properties -> new Block(properties));
    public static final Block ELEMENT_DY = registerBlock("element_dy", properties -> new Block(properties));
    public static final Block ELEMENT_HO = registerBlock("element_ho", properties -> new Block(properties));
    public static final Block ELEMENT_ER = registerBlock("element_er", properties -> new Block(properties));
    public static final Block ELEMENT_TM = registerBlock("element_tm", properties -> new Block(properties));
    public static final Block ELEMENT_YB = registerBlock("element_yb", properties -> new Block(properties));
    public static final Block ELEMENT_LU = registerBlock("element_lu", properties -> new Block(properties));
    public static final Block ELEMENT_HF = registerBlock("element_hf", properties -> new Block(properties));
    public static final Block ELEMENT_TA = registerBlock("element_ta", properties -> new Block(properties));
    public static final Block ELEMENT_W =  registerBlock("element_w",  properties -> new Block(properties));
    public static final Block ELEMENT_RE = registerBlock("element_re", properties -> new Block(properties));
    public static final Block ELEMENT_OS = registerBlock("element_os", properties -> new Block(properties));
    public static final Block ELEMENT_IR = registerBlock("element_ir", properties -> new Block(properties));
    public static final Block ELEMENT_PT = registerBlock("element_pt", properties -> new Block(properties));
    public static final Block ELEMENT_AU = registerBlock("element_au", properties -> new Block(properties));
    public static final Block ELEMENT_HG = registerBlock("element_hg", properties -> new Block(properties));
    public static final Block ELEMENT_TL = registerBlock("element_tl", properties -> new Block(properties));
    public static final Block ELEMENT_PB = registerBlock("element_pb", properties -> new Block(properties));
    public static final Block ELEMENT_BI = registerBlock("element_bi", properties -> new Block(properties));
    public static final Block ELEMENT_PO = registerBlock("element_po", properties -> new Block(properties));
    public static final Block ELEMENT_AT = registerBlock("element_at", properties -> new Block(properties));
    public static final Block ELEMENT_RN = registerBlock("element_rn", properties -> new Block(properties));
    public static final Block ELEMENT_FR = registerBlock("element_fr", properties -> new Block(properties));
    public static final Block ELEMENT_RA = registerBlock("element_ra", properties -> new Block(properties));
    public static final Block ELEMENT_AC = registerBlock("element_ac", properties -> new Block(properties));
    public static final Block ELEMENT_TH = registerBlock("element_th", properties -> new Block(properties));
    public static final Block ELEMENT_PA = registerBlock("element_pa", properties -> new Block(properties));
    public static final Block ELEMENT_U =  registerBlock("element_u",  properties -> new Block(properties));
    public static final Block ELEMENT_NP = registerBlock("element_np", properties -> new Block(properties));
    public static final Block ELEMENT_PU = registerBlock("element_pu", properties -> new Block(properties));
    public static final Block ELEMENT_AM = registerBlock("element_am", properties -> new Block(properties));
    public static final Block ELEMENT_CM = registerBlock("element_cm", properties -> new Block(properties));
    public static final Block ELEMENT_BK = registerBlock("element_bk", properties -> new Block(properties));
    public static final Block ELEMENT_CF = registerBlock("element_cf", properties -> new Block(properties));
    public static final Block ELEMENT_ES = registerBlock("element_es", properties -> new Block(properties));
    public static final Block ELEMENT_FM = registerBlock("element_fm", properties -> new Block(properties));
    public static final Block ELEMENT_MD = registerBlock("element_md", properties -> new Block(properties));
    public static final Block ELEMENT_NO = registerBlock("element_no", properties -> new Block(properties));
    public static final Block ELEMENT_LR = registerBlock("element_lr", properties -> new Block(properties));
    public static final Block ELEMENT_RF = registerBlock("element_rf", properties -> new Block(properties));
    public static final Block ELEMENT_DB = registerBlock("element_db", properties -> new Block(properties));
    public static final Block ELEMENT_SG = registerBlock("element_sg", properties -> new Block(properties));
    public static final Block ELEMENT_BH = registerBlock("element_bh", properties -> new Block(properties));
    public static final Block ELEMENT_HS = registerBlock("element_hs", properties -> new Block(properties));
    public static final Block ELEMENT_MT = registerBlock("element_mt", properties -> new Block(properties));
    public static final Block ELEMENT_DS = registerBlock("element_ds", properties -> new Block(properties));
    public static final Block ELEMENT_RG = registerBlock("element_rg", properties -> new Block(properties));
    public static final Block ELEMENT_CN = registerBlock("element_cn", properties -> new Block(properties));
    public static final Block ELEMENT_NH = registerBlock("element_nh", properties -> new Block(properties));
    public static final Block ELEMENT_FL = registerBlock("element_fl", properties -> new Block(properties));
    public static final Block ELEMENT_MC = registerBlock("element_mc", properties -> new Block(properties));
    public static final Block ELEMENT_LV = registerBlock("element_lv", properties -> new Block(properties));
    public static final Block ELEMENT_TS = registerBlock("element_ts", properties -> new Block(properties));
    public static final Block ELEMENT_OG = registerBlock("element_og", properties -> new Block(properties));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK,
            Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name), 
            new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, name)))));
    }
    
    public static void registerModBlocks() {
        JavaEducation.LOGGER.info("Registering Mod Blocks for " + JavaEducation.MOD_ID);
    }
}
