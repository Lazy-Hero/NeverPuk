package net;

import com.mojang.realmsclient.gui.ChatFormatting;
import net._v;
import net.ds;
import net.gn;
import net.o9;
import net.u9;
import net.un;
import net.nn.j;
import net.r.r;

public class ut extends un {
   public ut() {
      super("friend", "1", "§6.friend §3<name>", new String[]{"friend add", "friend del", "friend"});
   }

   public void o(String... var1) {
      String var2 = u9.A();
      if(var1.length == 1) {
         _v.A("§c.friend <name>");
      } else {
         String var3 = var1[1];
         r var4 = j.b().s8.k(var3);
         if(var4 == null) {
            _v.A("§cThat player could not be found!");
         } else if(var4 == j.b().sf) {
            _v.A("§cТы не можешь добавить самого себя!");
         } else {
            if(gn.Q.z.o(var4.Q())) {
               gn.Q.z.l(var4.Q());
               _v.A("§aRemoved player " + ChatFormatting.RED + var3 + ChatFormatting.WHITE + " §afrom friend list!");
            }

            gn.Q.z.d(new o9(var4.Q()));
            _v.A("§aAdded player " + ChatFormatting.RED + var3 + ChatFormatting.WHITE + " §ato friend-list!");
            gn.Y().q(ds.class).Q();
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
