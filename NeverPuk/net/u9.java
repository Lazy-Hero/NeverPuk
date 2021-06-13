package net;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.util.function.Consumer;
import net._v;
import net.gn;
import net.pi;
import net.un;
import net.xa;
import net.z_;
import org.lwjgl.input.Keyboard;

public class u9 extends un {
   private static String U;

   public u9() {
      super("macros", "macros", "§6.macro" + ChatFormatting.LIGHT_PURPLE + " add §3<key> </home_home> | §6.macro" + ChatFormatting.LIGHT_PURPLE + " del §3<key> | §6.macro" + ChatFormatting.LIGHT_PURPLE + " clear §3| §6.macro" + ChatFormatting.LIGHT_PURPLE + " list", new String[]{"§6.macro" + ChatFormatting.LIGHT_PURPLE + " add §3<key> </home_home> | §6.macro" + ChatFormatting.LIGHT_PURPLE + " del §3<key> | §6.macro" + ChatFormatting.LIGHT_PURPLE + " clear | §6.macro" + ChatFormatting.LIGHT_PURPLE + " list", "macro"});
   }

   public void o(String... var1) {
      String var2 = A();
      if(var1.length > 1) {
         if(!var1[0].equals("macro")) {
            return;
         }

         if(var1[1].equals("add")) {
            String var3 = var1[3];
            gn.Q.W.v(new xa(Keyboard.getKeyIndex(var1[2].toUpperCase()), var3.replace("_", " ")));
            _v.A(ChatFormatting.GREEN + "Added macro for key" + ChatFormatting.RED + " \"" + var1[2].toUpperCase() + ChatFormatting.RED + "\" " + ChatFormatting.WHITE + "with value " + ChatFormatting.RED + "\"" + var3.replace("_", " ") + "\"");
            pi.d("Macro Manager", ChatFormatting.GREEN + "Added macro for key" + ChatFormatting.RED + " \"" + var1[2].toUpperCase() + ChatFormatting.RED + "\" " + ChatFormatting.WHITE + "with value " + ChatFormatting.RED + "\"" + var3.replace("_", " ") + "\"", 4, z_.SUCCESS);
         }

         if(var1[1].equals("clear")) {
            if(gn.Q.W.Q().isEmpty()) {
               _v.A(ChatFormatting.RED + "Your macros list is empty!");
               pi.d("Macro Manager", "Your macro list is empty!", 4, z_.ERROR);
               return;
            }

            gn.Q.W.Q().clear();
            _v.A(ChatFormatting.GREEN + "Your macro list " + ChatFormatting.WHITE + " successfully cleared!");
            pi.d("Macro Manager", ChatFormatting.GREEN + "Your macro list " + ChatFormatting.WHITE + " successfully cleared!", 4, z_.SUCCESS);
         }

         if(var1[1].equals("del")) {
            gn.Q.W.P(Keyboard.getKeyIndex(var1[2].toUpperCase()));
            _v.A(ChatFormatting.GREEN + "Macro " + ChatFormatting.WHITE + "was deleted from key " + ChatFormatting.RED + "\"" + var1[2].toUpperCase() + "\"");
            pi.d("Macro Manager", ChatFormatting.GREEN + "Macro " + ChatFormatting.WHITE + "was deleted from key " + ChatFormatting.RED + "\"" + var1[2].toUpperCase() + "\"", 4, z_.SUCCESS);
         }

         if(!var1[1].equals("list")) {
            return;
         }

         if(gn.Q.W.Q().isEmpty()) {
            _v.A(ChatFormatting.RED + "Your macros list is empty!");
            pi.d("Macro Manager", "Your macro list is empty!", 4, z_.ERROR);
            return;
         }

         gn.Q.W.Q().forEach((var0) -> {
            _v.A(ChatFormatting.GREEN + "Macro list: " + ChatFormatting.WHITE + "Macro Name: " + ChatFormatting.RED + var0.S() + ChatFormatting.WHITE + ", Macro Bind: " + ChatFormatting.RED + Keyboard.getKeyName(var0.Q()));
         });
      }

      _v.A(this.i());
   }

   public static void y(String var0) {
      U = var0;
   }

   public static String A() {
      return U;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      y((String)null);
   }
}
