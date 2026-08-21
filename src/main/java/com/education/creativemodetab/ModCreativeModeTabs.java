package com.education.creativemodetab;

import com.education.JavaEducation;
import com.education.block.ModBlocks;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import com.education.item.ModItems;

public class ModCreativeModeTabs {
    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(JavaEducation.MOD_ID, "creative_tab")
    );

    public static final CreativeModeTab CUSTOM_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.ICE_BOMB))
            .title(Component.translatable("creative_tab.education-mod"))
            .displayItems((params, output) -> {
                output.accept(ModItems.ICE_BOMB);
                output.accept(ModItems.RAPID_FERTILIZER);
                output.accept(ModBlocks.CHEMICAL_HEAT.asItem());
                output.accept(ModBlocks.ELEMENT_UNKNOWN.asItem());
                output.accept(ModBlocks.ELEMENT_H.asItem());
                output.accept(ModBlocks.ELEMENT_HE.asItem());
                output.accept(ModBlocks.ELEMENT_LI.asItem());
                output.accept(ModBlocks.ELEMENT_BE.asItem());
                output.accept(ModBlocks.ELEMENT_B.asItem());
                output.accept(ModBlocks.ELEMENT_C.asItem());
                output.accept(ModBlocks.ELEMENT_N.asItem());
                output.accept(ModBlocks.ELEMENT_O.asItem());
                output.accept(ModBlocks.ELEMENT_F.asItem());
                output.accept(ModBlocks.ELEMENT_NE.asItem());
                output.accept(ModBlocks.ELEMENT_NA.asItem());
                output.accept(ModBlocks.ELEMENT_MG.asItem());
                output.accept(ModBlocks.ELEMENT_AL.asItem());
                output.accept(ModBlocks.ELEMENT_SI.asItem());
                output.accept(ModBlocks.ELEMENT_P.asItem());
                output.accept(ModBlocks.ELEMENT_S.asItem());
                output.accept(ModBlocks.ELEMENT_CL.asItem());
                output.accept(ModBlocks.ELEMENT_AR.asItem());
                output.accept(ModBlocks.ELEMENT_K.asItem());
                output.accept(ModBlocks.ELEMENT_CA.asItem());
                output.accept(ModBlocks.ELEMENT_SC.asItem());
                output.accept(ModBlocks.ELEMENT_TI.asItem());
                output.accept(ModBlocks.ELEMENT_V.asItem());
                output.accept(ModBlocks.ELEMENT_CR.asItem());
                output.accept(ModBlocks.ELEMENT_MN.asItem());
                output.accept(ModBlocks.ELEMENT_FE.asItem());
                output.accept(ModBlocks.ELEMENT_CO.asItem());
                output.accept(ModBlocks.ELEMENT_NI.asItem());
                output.accept(ModBlocks.ELEMENT_CU.asItem());
                output.accept(ModBlocks.ELEMENT_ZN.asItem());
                output.accept(ModBlocks.ELEMENT_GA.asItem());
                output.accept(ModBlocks.ELEMENT_GE.asItem());
                output.accept(ModBlocks.ELEMENT_AS.asItem());
                output.accept(ModBlocks.ELEMENT_SE.asItem());
                output.accept(ModBlocks.ELEMENT_BR.asItem());
                output.accept(ModBlocks.ELEMENT_KR.asItem());
                output.accept(ModBlocks.ELEMENT_RB.asItem());
                output.accept(ModBlocks.ELEMENT_SR.asItem());
                output.accept(ModBlocks.ELEMENT_Y.asItem());
                output.accept(ModBlocks.ELEMENT_ZR.asItem());
                output.accept(ModBlocks.ELEMENT_NB.asItem());
                output.accept(ModBlocks.ELEMENT_MO.asItem());
                output.accept(ModBlocks.ELEMENT_TC.asItem());
                output.accept(ModBlocks.ELEMENT_RU.asItem());
                output.accept(ModBlocks.ELEMENT_RH.asItem());
                output.accept(ModBlocks.ELEMENT_PD.asItem());
                output.accept(ModBlocks.ELEMENT_AG.asItem());
                output.accept(ModBlocks.ELEMENT_CD.asItem());
                output.accept(ModBlocks.ELEMENT_IN.asItem());
                output.accept(ModBlocks.ELEMENT_SN.asItem());
                output.accept(ModBlocks.ELEMENT_SB.asItem());
                output.accept(ModBlocks.ELEMENT_TE.asItem());
                output.accept(ModBlocks.ELEMENT_I.asItem());
                output.accept(ModBlocks.ELEMENT_XE.asItem());
                output.accept(ModBlocks.ELEMENT_CS.asItem());
                output.accept(ModBlocks.ELEMENT_BA.asItem());
                output.accept(ModBlocks.ELEMENT_LA.asItem());
                output.accept(ModBlocks.ELEMENT_CE.asItem());
                output.accept(ModBlocks.ELEMENT_PR.asItem());
                output.accept(ModBlocks.ELEMENT_ND.asItem());
                output.accept(ModBlocks.ELEMENT_PM.asItem());
                output.accept(ModBlocks.ELEMENT_SM.asItem());
                output.accept(ModBlocks.ELEMENT_EU.asItem());
                output.accept(ModBlocks.ELEMENT_GD.asItem());
                output.accept(ModBlocks.ELEMENT_TB.asItem());
                output.accept(ModBlocks.ELEMENT_DY.asItem());
                output.accept(ModBlocks.ELEMENT_HO.asItem());
                output.accept(ModBlocks.ELEMENT_ER.asItem());
                output.accept(ModBlocks.ELEMENT_TM.asItem());
                output.accept(ModBlocks.ELEMENT_YB.asItem());
                output.accept(ModBlocks.ELEMENT_LU.asItem());
                output.accept(ModBlocks.ELEMENT_HF.asItem());
                output.accept(ModBlocks.ELEMENT_TA.asItem());
                output.accept(ModBlocks.ELEMENT_W.asItem());
                output.accept(ModBlocks.ELEMENT_RE.asItem());
                output.accept(ModBlocks.ELEMENT_OS.asItem());
                output.accept(ModBlocks.ELEMENT_IR.asItem());
                output.accept(ModBlocks.ELEMENT_PT.asItem());
                output.accept(ModBlocks.ELEMENT_AU.asItem());
                output.accept(ModBlocks.ELEMENT_HG.asItem());
                output.accept(ModBlocks.ELEMENT_TL.asItem());
                output.accept(ModBlocks.ELEMENT_PB.asItem());
                output.accept(ModBlocks.ELEMENT_BI.asItem());
                output.accept(ModBlocks.ELEMENT_PO.asItem());
                output.accept(ModBlocks.ELEMENT_AT.asItem());
                output.accept(ModBlocks.ELEMENT_RN.asItem());
                output.accept(ModBlocks.ELEMENT_FR.asItem());
                output.accept(ModBlocks.ELEMENT_RA.asItem());
                output.accept(ModBlocks.ELEMENT_AC.asItem());
                output.accept(ModBlocks.ELEMENT_TH.asItem());
                output.accept(ModBlocks.ELEMENT_PA.asItem());
                output.accept(ModBlocks.ELEMENT_U.asItem());
                output.accept(ModBlocks.ELEMENT_NP.asItem());
                output.accept(ModBlocks.ELEMENT_PU.asItem());
                output.accept(ModBlocks.ELEMENT_AM.asItem());
                output.accept(ModBlocks.ELEMENT_CM.asItem());
                output.accept(ModBlocks.ELEMENT_BK.asItem());
                output.accept(ModBlocks.ELEMENT_CF.asItem());
                output.accept(ModBlocks.ELEMENT_ES.asItem());
                output.accept(ModBlocks.ELEMENT_FM.asItem());
                output.accept(ModBlocks.ELEMENT_MD.asItem());
                output.accept(ModBlocks.ELEMENT_NO.asItem());
                output.accept(ModBlocks.ELEMENT_LR.asItem());
                output.accept(ModBlocks.ELEMENT_RF.asItem());
                output.accept(ModBlocks.ELEMENT_DB.asItem());
                output.accept(ModBlocks.ELEMENT_SG.asItem());
                output.accept(ModBlocks.ELEMENT_BH.asItem());
                output.accept(ModBlocks.ELEMENT_HS.asItem());
                output.accept(ModBlocks.ELEMENT_MT.asItem());
                output.accept(ModBlocks.ELEMENT_DS.asItem());
                output.accept(ModBlocks.ELEMENT_RG.asItem());
                output.accept(ModBlocks.ELEMENT_CN.asItem());
                output.accept(ModBlocks.ELEMENT_NH.asItem());
                output.accept(ModBlocks.ELEMENT_FL.asItem());
                output.accept(ModBlocks.ELEMENT_MC.asItem());
                output.accept(ModBlocks.ELEMENT_LV.asItem());
                output.accept(ModBlocks.ELEMENT_TS.asItem());
                output.accept(ModBlocks.ELEMENT_OG.asItem());
            })
            .build();

    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_CREATIVE_TAB_KEY, CUSTOM_CREATIVE_TAB);
    }
}
