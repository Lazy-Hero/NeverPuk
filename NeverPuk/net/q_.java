package net;

import java.util.HashMap;
import java.util.Map;
import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.nn.j;
import net.y0.d;
import net.y0.d5;
import net.y6.et;
import net.y6.jb;
import net.yn.g;

public class q_ extends iy {
   private static Map d = null;

   public q_() {
      super(g.class, "ocelot", 0.4F);
   }

   public net.y6.z J() {
      return new et();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof et)) {
         return null;
      } else {
         et var4 = (et)var1;
         Map var5 = I();
         if(var5.containsKey(var2)) {
            int var6 = ((Integer)var5.get(var2)).intValue();
            return (jb)i6.g(var4, i6.Mf, var6);
         } else {
            return null;
         }
      }
   }

   private static Map I() {
      String var0 = iy.A();
      if(d != null) {
         return d;
      } else {
         d = new HashMap();
         d.put("back_left_leg", Integer.valueOf(0));
         d.put("back_right_leg", Integer.valueOf(1));
         d.put("front_left_leg", Integer.valueOf(2));
         d.put("front_right_leg", Integer.valueOf(3));
         d.put("tail", Integer.valueOf(4));
         d.put("tail2", Integer.valueOf(5));
         d.put("head", Integer.valueOf(6));
         d.put("body", Integer.valueOf(7));
         return d;
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      d5 var4 = new d5(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
