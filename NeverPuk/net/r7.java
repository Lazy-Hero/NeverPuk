package net;

import java.util.HashMap;
import java.util.Map;
import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.nn.j;
import net.y0.d;
import net.y6.ez;
import net.y6.jb;

public class r7 extends iy {
   private static Map o = null;

   public r7() {
      super(net.yn.z.class, "rabbit", 0.3F);
   }

   public net.y6.z J() {
      return new ez();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof ez)) {
         return null;
      } else {
         ez var4 = (ez)var1;
         Map var5 = z();
         if(var5.containsKey(var2)) {
            int var6 = ((Integer)var5.get(var2)).intValue();
            return (jb)i6.g(var4, i6.Ma, var6);
         } else {
            return null;
         }
      }
   }

   private static Map z() {
      String var0 = iy.A();
      if(o != null) {
         return o;
      } else {
         o = new HashMap();
         o.put("left_foot", Integer.valueOf(0));
         o.put("right_foot", Integer.valueOf(1));
         o.put("left_thigh", Integer.valueOf(2));
         o.put("right_thigh", Integer.valueOf(3));
         o.put("body", Integer.valueOf(4));
         o.put("left_arm", Integer.valueOf(5));
         o.put("right_arm", Integer.valueOf(6));
         o.put("head", Integer.valueOf(7));
         o.put("right_ear", Integer.valueOf(8));
         o.put("left_ear", Integer.valueOf(9));
         o.put("tail", Integer.valueOf(10));
         o.put("nose", Integer.valueOf(11));
         return o;
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      net.y0.db var4 = new net.y0.db(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
