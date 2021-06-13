package net.no;

import java.io.IOException;
import java.util.UUID;
import net.no.s8;
import net.yv.of;

public class sj implements net.n2.k {
   private UUID f;
   private sj.k x;
   private net.cb.t s;
   private float R;
   private of.y L;
   private of.f U;
   private boolean A;
   private boolean q;
   private boolean u;

   public sj() {
   }

   public sj(sj.k var1, of var2) {
      this.x = var1;
      this.f = var2.a();
      this.s = var2.t();
      this.R = var2.g();
      this.L = var2.y();
      this.U = var2.t();
      this.A = var2.r();
      this.q = var2.Q();
      this.u = var2.e();
   }

   public void E(net.n2.h var1) throws IOException {
      s8.Y();
      this.f = var1.J();
      this.x = (sj.k)var1.S(sj.k.class);
      switch(null.v[this.x.ordinal()]) {
      case 1:
         this.s = var1.g();
         this.R = var1.readFloat();
         this.L = (of.y)var1.S(of.y.class);
         this.U = (of.f)var1.S(of.f.class);
         this.C(var1.readUnsignedByte());
      case 2:
      default:
      case 3:
         this.R = var1.readFloat();
      case 4:
         this.s = var1.g();
      case 5:
         this.L = (of.y)var1.S(of.y.class);
         this.U = (of.f)var1.S(of.f.class);
      case 6:
         this.C(var1.readUnsignedByte());
      }
   }

   private void C(int var1) {
      this.A = (var1 & 1) > 0;
      this.q = (var1 & 2) > 0;
      this.u = (var1 & 2) > 0;
   }

   public void O(net.n2.h var1) throws IOException {
      var1.l(this.f);
      var1.A(this.x);
      switch(null.v[this.x.ordinal()]) {
      case 1:
         var1.p(this.s);
         var1.writeFloat(this.R);
         var1.A(this.L);
         var1.A(this.U);
         var1.writeByte(this.z());
      case 2:
      default:
         break;
      case 3:
         var1.writeFloat(this.R);
         break;
      case 4:
         var1.p(this.s);
         break;
      case 5:
         var1.A(this.L);
         var1.A(this.U);
         break;
      case 6:
         var1.writeByte(this.z());
      }

   }

   private int z() {
      int var1 = 0;
      if(this.A) {
         var1 |= 1;
      }

      if(this.q) {
         var1 |= 2;
      }

      if(this.u) {
         var1 |= 2;
      }

      return var1;
   }

   public void o(net.x.t var1) {
      var1.H(this);
   }

   public UUID J() {
      return this.f;
   }

   public sj.k L() {
      return this.x;
   }

   public net.cb.t r() {
      return this.s;
   }

   public float w() {
      return this.R;
   }

   public of.y f() {
      return this.L;
   }

   public of.f g() {
      return this.U;
   }

   public boolean n() {
      return this.A;
   }

   public boolean d() {
      return this.q;
   }

   public boolean V() {
      return this.u;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public static enum k {
      ADD,
      REMOVE,
      UPDATE_PCT,
      UPDATE_NAME,
      UPDATE_STYLE,
      UPDATE_PROPERTIES;
   }
}
