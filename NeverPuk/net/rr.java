package net;

import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.z9;
import net.c5.e;
import net.c5.g;
import net.y6.es;
import net.y6.jb;

public class rr extends iy {
   public rr() {
      super(net.ni.sg.class, "sign", 0.0F);
   }

   public net.y6.z J() {
      return new es();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof es)) {
         return null;
      } else {
         es var4 = (es)var1;
         return var2.equals("board")?var4.X:(var2.equals("stick")?var4.u:null);
      }
   }

   public bx A(net.y6.z var1, float var2) {
      iy.A();
      g var4 = g.E;
      Object var5 = var4.E(net.ni.sg.class);
      if(!(var5 instanceof net.c5.z)) {
         return null;
      } else {
         if(((e)var5).j() == null) {
            var5 = new net.c5.z();
            ((e)var5).m(var4);
         }

         if(!i6.BS.I()) {
            z9.h("Field not found: TileEntitySignRenderer.model");
            return null;
         } else {
            i6.t(var5, i6.BS, var1);
            return (bx)var5;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
