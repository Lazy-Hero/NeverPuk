package net;

import net.bx;
import net.i6;
import net.iy;
import net.mf;
import net.xn;
import net.nk.f_;
import net.nn.j;
import net.y0.cm;
import net.y0.d;
import net.y6.ea;
import net.y6.jb;

public class rs extends iy {
   public rs() {
      super(f_.class, "witch", 0.5F);
   }

   public net.y6.z J() {
      return new ea(0.0F);
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof ea)) {
         return null;
      } else {
         ea var4 = (ea)var1;
         return var2.equals("mole")?(jb)i6.G((Object)var4, (mf)i6.UP):(var2.equals("hat")?(jb)i6.G((Object)var4, (mf)i6.Mk):(var2.equals("head")?var4.S:(var2.equals("body")?var4.H:(var2.equals("arms")?var4.q:(var2.equals("left_leg")?var4.L:(var2.equals("right_leg")?var4.I:(var2.equals("nose")?var4.U:null)))))));
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      cm var4 = new cm(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
