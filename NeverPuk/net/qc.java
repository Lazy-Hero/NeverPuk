package net;

import java.util.HashMap;
import java.util.Map;
import net.bx;
import net.i6;
import net.iy;
import net.xn;
import net.nn.j;
import net.y0.d;
import net.y0.d3;
import net.y6.ek;
import net.y6.jb;
import net.yn.c;

public class qc extends iy {
   private static Map m = null;

   public qc() {
      super(c.class, "horse", 0.75F);
   }

   protected qc(Class var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   public net.y6.z J() {
      return new ek();
   }

   public jb k(net.y6.z var1, String var2) {
      String var3 = iy.A();
      if(!(var1 instanceof ek)) {
         return null;
      } else {
         ek var4 = (ek)var1;
         Map var5 = h();
         if(var5.containsKey(var2)) {
            int var6 = ((Integer)var5.get(var2)).intValue();
            return (jb)i6.g(var4, i6.G, var6);
         } else {
            return null;
         }
      }
   }

   private static Map h() {
      String var0 = iy.A();
      if(m != null) {
         return m;
      } else {
         m = new HashMap();
         m.put("head", Integer.valueOf(0));
         m.put("upper_mouth", Integer.valueOf(1));
         m.put("lower_mouth", Integer.valueOf(2));
         m.put("horse_left_ear", Integer.valueOf(3));
         m.put("horse_right_ear", Integer.valueOf(4));
         m.put("mule_left_ear", Integer.valueOf(5));
         m.put("mule_right_ear", Integer.valueOf(6));
         m.put("neck", Integer.valueOf(7));
         m.put("horse_face_ropes", Integer.valueOf(8));
         m.put("mane", Integer.valueOf(9));
         m.put("body", Integer.valueOf(10));
         m.put("tail_base", Integer.valueOf(11));
         m.put("tail_middle", Integer.valueOf(12));
         m.put("tail_tip", Integer.valueOf(13));
         m.put("back_left_leg", Integer.valueOf(14));
         m.put("back_left_shin", Integer.valueOf(15));
         m.put("back_left_hoof", Integer.valueOf(16));
         m.put("back_right_leg", Integer.valueOf(17));
         m.put("back_right_shin", Integer.valueOf(18));
         m.put("back_right_hoof", Integer.valueOf(19));
         m.put("front_left_leg", Integer.valueOf(20));
         m.put("front_left_shin", Integer.valueOf(21));
         m.put("front_left_hoof", Integer.valueOf(22));
         m.put("front_right_leg", Integer.valueOf(23));
         m.put("front_right_shin", Integer.valueOf(24));
         m.put("front_right_hoof", Integer.valueOf(25));
         m.put("mule_left_chest", Integer.valueOf(26));
         m.put("mule_right_chest", Integer.valueOf(27));
         m.put("horse_saddle_bottom", Integer.valueOf(28));
         m.put("horse_saddle_front", Integer.valueOf(29));
         m.put("horse_saddle_back", Integer.valueOf(30));
         m.put("horse_left_saddle_rope", Integer.valueOf(31));
         m.put("horse_left_saddle_metal", Integer.valueOf(32));
         m.put("horse_right_saddle_rope", Integer.valueOf(33));
         m.put("horse_right_saddle_metal", Integer.valueOf(34));
         m.put("horse_left_face_metal", Integer.valueOf(35));
         m.put("horse_right_face_metal", Integer.valueOf(36));
         m.put("horse_left_rein", Integer.valueOf(37));
         m.put("horse_right_rein", Integer.valueOf(38));
         return m;
      }
   }

   public bx A(net.y6.z var1, float var2) {
      d var3 = j.b().N();
      d3 var4 = new d3(var3);
      var4.y = var1;
      var4.W = var2;
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
