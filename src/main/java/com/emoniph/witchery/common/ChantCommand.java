package com.emoniph.witchery.common;

import com.emoniph.witchery.Witchery;
import com.emoniph.witchery.util.ChatUtil;
import java.util.ArrayList;
import java.util.List;
import joptsimple.internal.Strings;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ChantCommand implements ICommand {

   private final List aliases = new ArrayList();


   public ChantCommand() {
      this.aliases.add(this.getCommandName());
   }

   @Override
   public String getCommandName() {
      return "chant";
   }

   @Override
   public String getCommandUsage(ICommandSender icommandsender) {
      return this.getCommandName() + " <message>";
   }

   @Override
   public List getCommandAliases() {
      return this.aliases;
   }

   @Override
   public void processCommand(ICommandSender sender, String[] args) {
      if(args.length == 0) {
         ChatUtil.sendTranslated(EnumChatFormatting.RED, sender, "witchery.rite.unknownchant", new Object[0]);
      } else {
         World world = sender.getEntityWorld();
         if(world != null) {
            String strings = Strings.join(args, " ");
            EntityPlayer player = world.getPlayerEntityByName(sender.getCommandSenderName());
            if(player != null) {
               if(Witchery.Items.RUBY_SLIPPERS.trySayTheresNoPlaceLikeHome(player, strings)) {
                  return;
               }

               if(Witchery.Blocks.MIRROR.trySayMirrorMirrorSendMeHome(player, strings)) {
                  return;
               }
            }
         }

         ChatUtil.sendTranslated(EnumChatFormatting.RED, sender, "witchery.rite.unknownchant", new Object[0]);
      }
   }

   @Override
   public boolean canCommandSenderUseCommand(ICommandSender sender) {
      return true;
   }

   @Override
   public List addTabCompletionOptions(ICommandSender icommandsender, String[] astring) {
      return null;
   }

   @Override
   public boolean isUsernameIndex(String[] astring, int i) {
      return false;
   }

   @Override
   public int compareTo(Object arg0) {
      return 0;
   }
}
