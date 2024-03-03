package net.matt.yggdrasil.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.matt.yggdrasil.Yggdrasil_mod;
import net.matt.yggdrasil.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.text.Text;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Yggdrasil_mod.MOD_ID, "yggdrasil"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.yggdrasil_group"))
                    .icon(() -> new ItemStack(ModItems.YGGDRASIL_ESSENCE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.YGGDRASIL_ESSENCE);

                        entries.add(ModBlocks.YGGDRASIL_LOG);
                    }).build());

    public static void registerItemGroups() {
        Yggdrasil_mod.LOGGER.info("Registering Item Groups for "+ Yggdrasil_mod.MOD_ID);
    }
}