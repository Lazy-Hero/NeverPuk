package net.no;

import java.io.IOException;
import net.no.s8;

public class sx implements net.n2.k {
   private sx.s F;
   private int X;
   private double v;
   private double d;
   private double m;
   private double O;
   private long I;
   private int R;
   private int Q;

   public sx() {
   }

   public sx(net.nz.p var1, sx.s var2) {
      this.F = var2;
      this.v = var1.s();
      this.d = var1.A();
      this.O = var1.b();
      this.m = var1.E();
      this.I = var1.P();
      this.X = var1.r();
      this.Q = var1.l();
      this.R = var1.N();
   }

   public void E(net.n2.h var1) throws IOException {
      this.F = (sx.s)var1.S(sx.s.class);
      switch(null.t[this.F.ordinal()]) {
      case 1:
         this.m = var1.readDouble();
         break;
      case 2:
         this.O = var1.readDouble();
         this.m = var1.readDouble();
         this.I = var1.M();
         break;
      case 3:
         this.v = var1.readDouble();
         this.d = var1.readDouble();
         break;
      case 4:
         this.Q = var1.q();
         break;
      case 5:
         this.R = var1.q();
         break;
      case 6:
         this.v = var1.readDouble();
         this.d = var1.readDouble();
         this.O = var1.readDouble();
         this.m = var1.readDouble();
         this.I = var1.M();
         this.X = var1.q();
         this.Q = var1.q();
         this.R = var1.q();
      }

   }

   public void O(net.n2.h var1) throws IOException {
      s8.x();
      var1.A(this.F);
      switch(null.t[this.F.ordinal()]) {
      case 1:
         var1.writeDouble(this.m);
      case 2:
         var1.writeDouble(this.O);
         var1.writeDouble(this.m);
         var1.N(this.I);
      case 3:
         var1.writeDouble(this.v);
         var1.writeDouble(this.d);
      case 4:
         var1.a(this.Q);
      case 5:
         var1.a(this.R);
      case 6:
         var1.writeDouble(this.v);
         var1.writeDouble(this.d);
         var1.writeDouble(this.O);
         var1.writeDouble(this.m);
         var1.N(this.I);
         var1.a(this.X);
         var1.a(this.Q);
         var1.a(this.R);
      default:
      }
   }

   public void u(net.x.t var1) {
      var1.U(this);
   }

   public void d(net.nz.p var1) {
      switch(null.t[this.F.ordinal()]) {
      case 1:
         var1.h(this.m);
         break;
      case 2:
         var1.n(this.O, this.m, this.I);
         break;
      case 3:
         var1.w(this.v, this.d);
         break;
      case 4:
         var1.H(this.Q);
         break;
      case 5:
         var1.D(this.R);
         break;
      case 6:
         var1.w(this.v, this.d);
         if(this.I > 0L) {
            var1.n(this.O, this.m, this.I);
         } else {
            var1.h(this.m);
         }

         var1.p(this.X);
         var1.H(this.Q);
         var1.D(this.R);
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public static enum s {
      SET_SIZE,
      LERP_SIZE,
      SET_CENTER,
      INITIALIZE,
      SET_WARNING_TIME,
      SET_WARNING_BLOCKS;
   }
}
