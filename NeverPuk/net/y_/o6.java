package net.y_;

import com.google.common.collect.Sets;
import java.util.Set;
import net.n0.ks;
import net.y_.b;

public class o6 extends b {
   private final net.ne.s m;
   private final double B;
   private double Z;
   private double a;
   private double e;
   private double R;
   private double C;
   private net.r.r y;
   private int X;
   private boolean I;
   private final Set F;
   private final boolean c;

   public o6(net.ne.s var1, double var2, net.n0.y var4, boolean var5) {
      this(var1, var2, var5, Sets.newHashSet(new net.n0.y[]{var4}));
   }

   public o6(net.ne.s var1, double var2, boolean var4, Set var5) {
      this.m = var1;
      this.B = var2;
      this.F = var5;
      this.c = var4;
      this.h(3);
      if(!(var1.H() instanceof net.b.s)) {
         throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
      }
   }

   public boolean f() {
      if(this.X > 0) {
         --this.X;
         return false;
      } else {
         this.y = this.m.hl.d(this.m, 10.0D);
         return this.y == null?false:this.O(this.y.S()) || this.O(this.y.L());
      }
   }

   protected boolean O(ks var1) {
      return this.F.contains(var1.Z());
   }

   public boolean X() {
      boolean var1 = b.q();
      if(this.c) {
         if(this.m.F(this.y) < 36.0D) {
            if(Double.compare(this.y.o(this.Z, this.a, this.e), 0.010000000000000002D) > 0) {
               return false;
            }

            if(Double.compare(Math.abs((double)this.y.V - this.R), 5.0D) > 0 || Math.abs((double)this.y.hN - this.C) > 5.0D) {
               return false;
            }
         } else {
            this.Z = this.y.b;
            this.a = this.y.hS;
            this.e = this.y.hr;
         }

         this.R = (double)this.y.V;
         this.C = (double)this.y.hN;
      }

      return this.f();
   }

   public void I() {
      this.Z = this.y.b;
      this.a = this.y.hS;
      this.e = this.y.hr;
      this.I = true;
   }

   public void C() {
      this.y = null;
      this.m.H().u();
      this.X = 100;
      this.I = false;
   }

   public void E() {
      this.m.E().n(this.y, (float)(this.m.v() + 20), (float)this.m.w());
      if(this.m.F(this.y) < 6.25D) {
         this.m.H().u();
      } else {
         this.m.H().F(this.y, this.B);
      }

   }

   public boolean O() {
      return this.I;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
