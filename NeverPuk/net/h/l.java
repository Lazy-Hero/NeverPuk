package net.h;

import javax.annotation.Nullable;
import net.xn;
import net.h.d;
import net.h.m;
import net.h.n;
import net.yz.m_;
import net.yz.p;

public abstract class l implements d {
   protected net.h.z Y;
   @Nullable
   private n V;
   protected p k;
   protected m_ K;
   protected float e;
   protected float J;
   protected float g;
   protected float C;
   protected float t;
   protected boolean B;
   protected int y;
   protected d.x Z;
   private static String[] L;

   protected l(net.yz.a var1, p var2) {
      this(var1.J(), var2);
   }

   protected l(m_ var1, p var2) {
      this.e = 1.0F;
      this.J = 1.0F;
      this.Z = d.x.LINEAR;
      this.K = var1;
      this.k = var2;
   }

   public m_ o() {
      return this.K;
   }

   public n r(m var1) {
      l();
      this.V = var1.I(this.K);
      if(this.V == null) {
         this.Y = m.R;
      }

      this.Y = this.V.C();
      return this.V;
   }

   public net.h.z N() {
      return this.Y;
   }

   public p p() {
      return this.k;
   }

   public boolean G() {
      return this.B;
   }

   public int Z() {
      return this.y;
   }

   public float d() {
      return this.e * this.Y.G();
   }

   public float n() {
      return this.J * this.Y.J();
   }

   public float g() {
      return this.g;
   }

   public float K() {
      return this.C;
   }

   public float e() {
      return this.t;
   }

   public d.x k() {
      return this.Z;
   }

   public static void I(String[] var0) {
      L = var0;
   }

   public static String[] l() {
      return L;
   }

   private static xn b(xn var0) {
      return var0;
   }

   static {
      if(l() != null) {
         I(new String[5]);
      }

   }
}
