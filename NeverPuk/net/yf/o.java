package net.yf;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.Arrays;
import it.unimi.dsi.fastutil.Swapper;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import net.xn;
import net.yf.p;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class o {
   private static final boolean o = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
   private static final boolean C = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
   private static final Logger N = LogManager.getLogger();
   protected final List U = Lists.newArrayList();
   private final IntList d = new IntArrayList();
   private final IntList n = new IntArrayList();
   private IntList P = new IntArrayList();
   private IntList D = new IntArrayList();
   private int W;

   public void j(Object var1, String var2) {
      this.W = Math.max(this.W, var2.length());
      int var3 = this.U.size();
      this.U.add(var1);
      this.n.add(this.d.size());

      for(int var4 = 0; var4 < var2.length(); ++var4) {
         this.P.add(var3);
         this.D.add(var4);
         this.d.add(var2.charAt(var4));
      }

      this.P.add(var3);
      this.D.add(var2.length());
      this.d.add(-1);
   }

   public void e() {
      p.A();
      int var2 = this.d.size();
      int[] var3 = new int[var2];
      final int[] var4 = new int[var2];
      final int[] var5 = new int[var2];
      int[] var6 = new int[var2];
      IntComparator var7 = new IntComparator() {
         public int compare(int var1, int var2) {
            boolean var3 = p.A();
            return var4[var1] == var4[var2]?Integer.compare(var5[var1], var5[var2]):Integer.compare(var4[var1], var4[var2]);
         }

         public int g(Integer var1, Integer var2) {
            return this.compare(var1.intValue(), var2.intValue());
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
      Swapper var8 = (var3, var4x) -> {
         if(var3 != var4x) {
            int var5x = var4[var3];
            var4[var3] = var4[var4x];
            var4[var4x] = var5x;
            var5x = var5[var3];
            var5[var3] = var5[var4x];
            var5[var4x] = var5x;
            var5x = var6[var3];
            var6[var3] = var6[var4x];
            var6[var4x] = var5x;
         }

      };
      int var9 = 0;
      if(var9 < var2) {
         var3[var9] = this.d.getInt(var9);
         ++var9;
         net.u.d.h(new net.u.d[1]);
      }

      var9 = 1;
      int var10 = Math.min(var2, this.W);
      if(var9 * 2 < var10) {
         int var11 = 0;
         if(var11 < var2) {
            var4[var11] = var3[var11];
            var5[var11] = var11 + var9 < var2?var3[var11 + var9]:-2;
            var6[var11] = var11++;
         }

         Arrays.quickSort(0, var2, var7, var8);
         var11 = 0;
         if(var11 < var2) {
            var3[var6[var11]] = var11++;
         }

         var9 = var9 * 2;
      }

      IntList var17 = this.P;
      IntList var21 = this.D;
      this.P = new IntArrayList(var17.size());
      this.D = new IntArrayList(var21.size());
      int var12 = 0;
      if(var12 < var2) {
         int var13 = var6[var12];
         this.P.add(var17.getInt(var13));
         this.D.add(var21.getInt(var13));
         ++var12;
      }

      if(C) {
         this.o();
      }

   }

   private void o() {
      for(int var1 = 0; var1 < this.P.size(); ++var1) {
         N.debug("{} {}", Integer.valueOf(var1), this.b(var1));
      }

      N.debug("");
   }

   private String b(int var1) {
      int var2 = this.D.getInt(var1);
      int var3 = this.n.getInt(this.P.getInt(var1));
      StringBuilder var4 = new StringBuilder();

      for(int var5 = 0; var3 + var5 < this.d.size(); ++var5) {
         if(var5 == var2) {
            var4.append('^');
         }

         int var6 = ((Integer)this.d.get(var3 + var5)).intValue();
         if(var6 == -1) {
            break;
         }

         var4.append((char)var6);
      }

      return var4.toString();
   }

   private int z(String var1, int var2) {
      int var3 = this.n.getInt(this.P.getInt(var2));
      int var4 = this.D.getInt(var2);

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         int var6 = this.d.getInt(var3 + var4 + var5);
         if(var6 == -1) {
            return 1;
         }

         char var7 = var1.charAt(var5);
         char var8 = (char)var6;
         if(var7 < var8) {
            return -1;
         }

         if(var7 > var8) {
            return 1;
         }
      }

      return 0;
   }

   public List s(String var1) {
      int var2 = this.P.size();
      int var3 = 0;

      int var5;
      for(int var4 = var2; var3 < var4; var3 = var5 + 1) {
         var5 = var3 + (var4 - var3) / 2;
         int var6 = this.z(var1, var5);
         if(o) {
            N.debug("comparing lower \"{}\" with {} \"{}\": {}", var1, Integer.valueOf(var5), this.b(var5), Integer.valueOf(var6));
         }
      }

      if(var3 >= var2) {
         return Collections.emptyList();
      } else {
         int var15;
         for(int var14 = var2; var3 < var14; var3 = var15 + 1) {
            var15 = var3 + (var14 - var3) / 2;
            int var7 = this.z(var1, var15);
            if(o) {
               N.debug("comparing upper \"{}\" with {} \"{}\": {}", var1, Integer.valueOf(var15), this.b(var15), Integer.valueOf(var7));
            }
         }

         IntOpenHashSet var16 = new IntOpenHashSet();
         int[] var8 = var16.toIntArray();
         java.util.Arrays.sort(var8);
         LinkedHashSet var9 = Sets.newLinkedHashSet();

         for(int var13 : var8) {
            var9.add(this.U.get(var13));
         }

         return Lists.newArrayList(var9);
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
