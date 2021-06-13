package net;

import com.mojang.realmsclient.gui.ChatFormatting;
import net._v;
import net.pi;
import net.u9;
import net.un;
import net.vo;
import net.z_;
import net.nn.j;
import net.r.r;

public class uc extends un {
   public uc() {
      super("fakehack", "fakehack", "§6.fakehack" + ChatFormatting.LIGHT_PURPLE + " add | del | clear§3<name>", new String[]{"§6.fakehack" + ChatFormatting.LIGHT_PURPLE + " add | del | clear§3<name>", "fakehack"});
   }

   public void o(String... var1) {
      String var2 = u9.A();
      if(var1.length > 1) {
         if(!var1[0].equals("fakehack")) {
            return;
         }

         if(var1[1].equals("add")) {
            vo.Y.add(var1[2]);
            _v.A(ChatFormatting.GREEN + "Added player " + ChatFormatting.RED + var1[2] + ChatFormatting.WHITE + " as HACKER!");
            pi.d("FakeHack Manager", ChatFormatting.GREEN + "Added player " + ChatFormatting.RED + var1[2] + ChatFormatting.WHITE + " as HACKER!", 4, z_.SUCCESS);
         }

         if(var1[1].equals("del")) {
            r var3 = j.b().s8.k(var1[2]);
            if(var3 == null) {
               _v.A("§cThat player could not be found!");
               return;
            }

            if(vo.X(var3)) {
               vo.y(var3);
               _v.A(ChatFormatting.GREEN + "Hacker " + ChatFormatting.RED + var3.Q() + " " + ChatFormatting.WHITE + "was removed!");
               pi.d("FakeHack Manager", ChatFormatting.GREEN + "Hacker " + ChatFormatting.WHITE + "was removed!", 4, z_.SUCCESS);
            }
         }

         if(!var1[1].equals("clear")) {
            return;
         }

         if(vo.Y.isEmpty()) {
            _v.A(ChatFormatting.RED + "Your FakeHack list is empty!");
            pi.d("FakeHack Manager", "Your FakeHack list is empty!", 4, z_.ERROR);
            return;
         }

         vo.Y.clear();
         _v.A(ChatFormatting.GREEN + "Your FakeHack list " + ChatFormatting.WHITE + " successfully cleared!");
         pi.d("FakeHack Manager", ChatFormatting.GREEN + "Your FakeHack list " + ChatFormatting.WHITE + " successfully cleared!", 4, z_.SUCCESS);
      }

      _v.A(this.i());
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
