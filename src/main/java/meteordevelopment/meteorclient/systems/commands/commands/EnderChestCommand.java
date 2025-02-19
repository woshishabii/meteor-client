/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package meteordevelopment.meteorclient.systems.commands.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.systems.commands.Command;
import meteordevelopment.meteorclient.utils.Utils;
import net.minecraft.command.CommandSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

public class EnderChestCommand extends Command {
    public EnderChestCommand() {
        super("ender-chest", String.valueOf(Text.translatable("text.system.commands.commands.EnderChestCommand")), "ec", "echest");
    }

    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(context -> {
            Utils.openContainer(Items.ENDER_CHEST.getDefaultStack(), new ItemStack[27], true);
            return SINGLE_SUCCESS;
        });
    }
}
