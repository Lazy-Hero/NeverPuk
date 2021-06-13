package net;

import com.mojang.realmsclient.gui.ChatFormatting;
import net._v;
import net.gn;
import net.mk;
import net.pi;
import net.u9;
import net.un;
import net.z_;
import org.lwjgl.input.Keyboard;

public class uh extends un {
   public uh() {
      super("bind", "bind", "§6.bind" + ChatFormatting.LIGHT_PURPLE + " add §3<name> §3<key> | §6.bind " + ChatFormatting.LIGHT_PURPLE + "del §3<name> <key>", new String[]{"§6.bind" + ChatFormatting.LIGHT_PURPLE + " add §3<name> §3<key> | §6.bind" + ChatFormatting.LIGHT_PURPLE + "del §3<name> <key>", "bind"});
   }

   public void o(String... var1) {
      String var2 = u9.A();
      if(var1.length == 4) {
         String var3 = var1[2];
         String var4 = var1[3].toUpperCase();
         mk var5 = gn.Q.j.p(var3);
         if(var1[0].equals("bind")) {
            if(var1[1].equals("add")) {
               var5.z(Keyboard.getKeyIndex(var4));
               _v.A(ChatFormatting.GREEN + var5.i() + ChatFormatting.WHITE + " was set on key " + ChatFormatting.RED + "\"" + var4 + "\"");
               pi.d("Bind Manager", ChatFormatting.GREEN + var5.i() + ChatFormatting.WHITE + " was set on key " + ChatFormatting.RED + "\"" + var4 + "\"", 4, z_.SUCCESS);
            }

            if(var1[1].equals("del")) {
               var5.z(0);
               _v.A(ChatFormatting.GREEN + var5.i() + ChatFormatting.WHITE + " bind was deleted from key " + ChatFormatting.RED + "\"" + var4 + "\"");
               pi.d("Bind Manager", ChatFormatting.GREEN + var5.i() + ChatFormatting.WHITE + " bind was deleted from key " + ChatFormatting.RED + "\"" + var4 + "\"", 4, z_.SUCCESS);
            }
         }
      }

      _v.A(this.i());
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
