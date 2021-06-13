package net;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import net.i6;
import net.m3;
import net.mf;
import net.z9;
import net.l.q;

public class ic {
   private static mf E = null;

   public static boolean B(q var0) {
      if(E == null) {
         E = D(var0);
      }

      if(!E.I()) {
         return true;
      } else {
         Boolean var1 = (Boolean)i6.G((Object)var0, (mf)E);
         return var1.booleanValue();
      }
   }

   private static mf D(q var0) {
      String var1 = mf.O();
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();
      Field[] var4 = q.class.getDeclaredFields();
      int var5 = 0;
      if(var5 < var4.length) {
         Field var6 = var4[var5];
         if(var6.getType() == Boolean.TYPE) {
            var6.setAccessible(true);
            var2.add(var6);
            var3.add(var6.get(var0));
         }

         ++var5;
      }

      var0.o(false);
      ArrayList var14 = new ArrayList();
      Iterator var15 = var2.iterator();
      if(var15.hasNext()) {
         Object var7 = var15.next();
         var14.add(((Field)var7).get(var0));
      }

      var0.o(true);
      ArrayList var16 = new ArrayList();
      Iterator var17 = var2.iterator();
      if(var17.hasNext()) {
         Object var8 = var17.next();
         var16.add(((Field)var8).get(var0));
      }

      ArrayList var18 = new ArrayList();
      int var19 = 0;
      if(var19 < var2.size()) {
         Field var9 = (Field)var2.get(var19);
         Boolean var10 = (Boolean)var14.get(var19);
         Boolean var11 = (Boolean)var16.get(var19);
         if(!var10.booleanValue() && var11.booleanValue()) {
            var18.add(var9);
            Boolean var12 = (Boolean)var3.get(var19);
            var9.set(var0, var12);
         }

         ++var19;
      }

      if(var18.size() == 1) {
         Field var21 = (Field)var18.get(0);
         return new mf(var21);
      } else {
         z9.h("Error finding Chunk.hasEntities");
         return new mf(new m3(q.class), "hasEntities");
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
