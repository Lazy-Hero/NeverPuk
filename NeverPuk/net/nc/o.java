package net.nc;

import java.util.Comparator;
import net.xn;
import net.nc.b;
import net.nc.l;
import net.nc.m;
import net.u.d;

public class o {
   public static final Comparator M = new Comparator() {
      public int t(o var1, o var2) {
         d[] var3 = m.I();
         return var1.W() > var2.W()?1:(var1.W() < var2.W()?-1:var2.W().compareToIgnoreCase(var1.W()));
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private final b v;
   private final l T;
   private final String q;
   private int g;
   private boolean u;
   private boolean n;

   public o(b var1, l var2, String var3) {
      this.v = var1;
      this.T = var2;
      this.q = var3;
      this.n = true;
   }

   public void R(int var1) {
      d[] var2 = m.I();
      if(this.T.v().B()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.A(this.W() + var1);
      }
   }

   public void P(int var1) {
      if(this.T.v().B()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.A(this.W() - var1);
      }
   }

   public void G() {
      if(this.T.v().B()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.R(1);
      }
   }

   public int W() {
      return this.g;
   }

   public void A(int var1) {
      m.I();
      int var3 = this.g;
      this.g = var1;
      if(var3 != var1 || this.n) {
         this.n = false;
         this.H().N(this);
      }

   }

   public l M() {
      return this.T;
   }

   public String W() {
      return this.q;
   }

   public b H() {
      return this.v;
   }

   public boolean G() {
      return this.u;
   }

   public void b(boolean var1) {
      this.u = var1;
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }
}
