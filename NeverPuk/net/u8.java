package net;

import net.u9;
import net.un;
import net.nn.j;

public class u8 extends un {
   j W = j.b();

   public u8() {
      super("clip", "clip / hclip", "§6.clip / (hclip) + / - §3<value>", new String[]{"clip", "hclip"});
   }

   public void o(String... var1) {
      String var2 = u9.A();
      if(var1.length > 1) {
         if(var1[0].equalsIgnoreCase("clip")) {
            if(var1[1].equals("+")) {
               this.W.sf.t(this.W.sf.b, this.W.sf.hS + Double.parseDouble(var1[2]), this.W.sf.hr);
            }

            if(var1[1].equals("-")) {
               this.W.sf.t(this.W.sf.b, this.W.sf.hS - Double.parseDouble(var1[2]), this.W.sf.hr);
            }
         }

         if(!var1[0].equalsIgnoreCase("hclip")) {
            return;
         }

         double var3 = this.W.sf.b;
         double var5 = this.W.sf.hS;
         double var7 = this.W.sf.hr;
         double var9 = (double)this.W.sf.hN * 0.017453292D;
         if(var1[1].equals("+")) {
            this.W.sf.t(var3 - Math.sin(var9) * Double.parseDouble(var1[2]), var5, var7 + Math.cos(var9) * Double.parseDouble(var1[2]));
         }

         if(var1[1].equals("-")) {
            this.W.sf.t(var3 + Math.sin(var9) * Double.parseDouble(var1[2]), var5, var7 - Math.cos(var9) * Double.parseDouble(var1[2]));
         }
      }

      this.I();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
