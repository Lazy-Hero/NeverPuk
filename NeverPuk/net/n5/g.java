package net.n5;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.n5.l;
import net.n5.m;
import net.y.p;
import net.yz.ac;
import net.yz.aq;

public class g {
   public static final g u = new g() {
      protected void W(ac var1) {
         throw new UnsupportedOperationException();
      }

      public void R(ac var1) {
         throw new UnsupportedOperationException();
      }

      public boolean u(aq var1, aq var2) {
         return false;
      }
   };
   private final boolean[] R = new boolean[ac.values().length];
   private final boolean[] b = new boolean[ac.values().length];
   private boolean I = true;
   private final List d = Lists.newArrayList();
   private l D = new l();
   private p.h V;

   public boolean i() {
      return this.I;
   }

   protected void W(ac var1) {
      this.I = false;
      this.R[var1.ordinal()] = true;
   }

   public boolean I(ac var1) {
      int[] var2 = m.t();
      return !this.R[var1.ordinal()];
   }

   public void R(ac var1) {
      this.b[var1.ordinal()] = true;
   }

   public boolean Z(ac var1) {
      return this.b[var1.ordinal()];
   }

   public List W() {
      return this.d;
   }

   public void B(net.ni.v var1) {
      this.d.add(var1);
   }

   public boolean u(aq var1, aq var2) {
      return this.D.i(var1, var2);
   }

   public void N(l var1) {
      this.D = var1;
   }

   public p.h z() {
      return this.V;
   }

   public void u(p.h var1) {
      this.V = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
