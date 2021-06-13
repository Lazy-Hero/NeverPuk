package net.na;

import com.google.common.collect.Maps;
import java.util.Map;
import net.na.e;
import net.na.u;
import net.u.d;
import net.yz.m_;

public class l {
   private static final Map p = Maps.newHashMap();
   private static final Map a = Maps.newHashMap();

   public static void o(e.w var0) {
      m_ var1 = var0.I();
      Class var2 = var0.C();
      if(p.containsKey(var1)) {
         throw new IllegalArgumentException("Can\'t re-register entity property name " + var1);
      } else if(a.containsKey(var2)) {
         throw new IllegalArgumentException("Can\'t re-register entity property class " + var2.getName());
      } else {
         p.put(var1, var0);
         a.put(var2, var0);
      }
   }

   public static e.w d(m_ var0) {
      int var10000 = e.w.y();
      e.w var2 = (e.w)p.get(var0);
      int var1 = var10000;
      if(var2 == null) {
         throw new IllegalArgumentException("Unknown loot entity property \'" + var0 + "\'");
      } else {
         if(d.y() == null) {
            ++var1;
            e.w.q(var1);
         }

         return var2;
      }
   }

   public static e.w b(e var0) {
      e.w.y();
      e.w var2 = (e.w)a.get(var0.getClass());
      if(var2 == null) {
         throw new IllegalArgumentException("Unknown loot entity property " + var0);
      } else {
         d.h(new d[1]);
         return var2;
      }
   }

   static {
      o(new u.j());
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
