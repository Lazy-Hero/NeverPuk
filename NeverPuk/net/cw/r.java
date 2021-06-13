package net.cw;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.cw.t;
import net.u.d;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class r {
   private static final Joiner m = Joiner.on(",");
   private final List h = Lists.newArrayList();
   private final Map K = Maps.newHashMap();
   private int A;
   private int S;

   private r() {
      this.K.put(Character.valueOf(' '), Predicates.alwaysTrue());
   }

   public r j(String... var1) {
      String[] var2 = t.q.Z();
      if(!ArrayUtils.isEmpty(var1) && !StringUtils.isEmpty(var1[0])) {
         if(this.h.isEmpty()) {
            this.A = var1.length;
            this.S = var1[0].length();
         }

         if(var1.length != this.A) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.A + ", but was given one with a height of " + var1.length + ")");
         } else {
            int var4 = var1.length;
            int var5 = 0;
            if(var5 < var4) {
               String var6 = var1[var5];
               if(var6.length() != this.S) {
                  throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.S + ", found one with " + var6.length() + ")");
               }

               char[] var7 = var6.toCharArray();
               int var8 = var7.length;
               int var9 = 0;
               if(var9 < var8) {
                  char var10 = var7[var9];
                  if(!this.K.containsKey(Character.valueOf(var10))) {
                     this.K.put(Character.valueOf(var10), (Object)null);
                  }

                  ++var9;
                  d.h(new d[3]);
               }

               ++var5;
            }

            this.h.add(var1);
            return this;
         }
      } else {
         throw new IllegalArgumentException("Empty pattern for aisle");
      }
   }

   public static r G() {
      return new r();
   }

   public r d(char var1, Predicate var2) {
      this.K.put(Character.valueOf(var1), var2);
      return this;
   }

   public t e() {
      return new t(this.n());
   }

   private Predicate[][][] n() {
      this.e();
      Predicate[][][] var1 = (Predicate[][][])((Predicate[][][])Array.newInstance(Predicate.class, new int[]{this.h.size(), this.A, this.S}));

      for(int var2 = 0; var2 < this.h.size(); ++var2) {
         for(int var3 = 0; var3 < this.A; ++var3) {
            for(int var4 = 0; var4 < this.S; ++var4) {
               var1[var2][var3][var4] = (Predicate)this.K.get(Character.valueOf(((String[])((String[])this.h.get(var2)))[var3].charAt(var4)));
            }
         }
      }

      return var1;
   }

   private void e() {
      ArrayList var1 = Lists.newArrayList();

      for(Entry var3 : this.K.entrySet()) {
         if(var3.getValue() == null) {
            var1.add(var3.getKey());
         }
      }

      if(!var1.isEmpty()) {
         throw new IllegalStateException("Predicates for character(s) " + m.join(var1) + " are missing");
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
