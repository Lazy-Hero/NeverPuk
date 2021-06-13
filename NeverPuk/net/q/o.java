package net.q;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.xn;
import net.cr.s;
import net.n0.ks;
import net.v.c;

public class o {
   private final List S = Lists.newArrayList();
   private final BitSet c = new BitSet();
   private final BitSet i = new BitSet();
   private final BitSet u = new BitSet();
   private boolean M = true;
   private static String[] E;

   public boolean b() {
      return !this.u.isEmpty();
   }

   public void W(c var1) {
      for(int var2 = 0; var2 < this.S.size(); ++var2) {
         this.u.set(var2, var1.Q((s)this.S.get(var2)));
      }

   }

   public void P(net.yf.p var1, int var2, int var3, c var4) {
      r();
      int var6 = 0;
      if(var6 < this.S.size()) {
         s var7 = (s)this.S.get(var6);
         boolean var8 = var7.T(var2, var3) && var4.Q(var7);
         this.i.set(var6, var8);
         this.c.set(var6, false);
         ++var6;
      }

   }

   public boolean A(s var1) {
      return this.c.get(this.S.indexOf(var1));
   }

   public boolean T() {
      return !this.c.isEmpty();
   }

   public boolean v() {
      return !this.i.isEmpty();
   }

   public List h() {
      return this.S;
   }

   public List T(boolean var1) {
      ArrayList var2 = Lists.newArrayList();
      int var3 = this.u.nextSetBit(0);

      while(true) {
         if(this.c.get(var3)) {
            var2.add(this.S.get(var3));
         }

         var3 = this.u.nextSetBit(var3 + 1);
      }
   }

   public List y(boolean var1) {
      ArrayList var2 = Lists.newArrayList();
      int var3 = this.u.nextSetBit(0);

      while(true) {
         if(this.i.get(var3) && this.c.get(var3) == var1) {
            var2.add(this.S.get(var3));
         }

         var3 = this.u.nextSetBit(var3 + 1);
      }
   }

   public void k(s var1) {
      this.S.add(var1);
      if(this.M) {
         ks var2 = ((s)this.S.get(0)).E();
         ks var3 = var1.E();
         this.M = ks.K(var2, var3) && ks.a(var2, var3);
      }

   }

   public boolean p() {
      return this.M;
   }

   public static void x(String[] var0) {
      E = var0;
   }

   public static String[] r() {
      return E;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(r() == null) {
         x(new String[2]);
      }

   }
}
