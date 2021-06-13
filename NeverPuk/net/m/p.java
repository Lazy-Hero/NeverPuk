package net.m;

import java.io.IOException;
import javax.annotation.Nullable;
import net.m.qo;

public class p implements net.n2.k {
   private int f;
   public p.f Z;
   private net.u.r M;
   private net.yz.k w;
   private net.ne.l Y;

   public p() {
   }

   public p(net.ne.l var1) {
      this.f = var1.G();
      this.Y = var1;
      this.Z = p.f.ATTACK;
   }

   public p(net.ne.l var1, p.f var2) {
      this.f = var1.G();
      this.Y = var1;
      this.Z = var2;
   }

   public p(net.ne.l var1, net.yz.k var2) {
      this.f = var1.G();
      this.Y = var1;
      this.Z = p.f.INTERACT;
      this.w = var2;
   }

   public p(net.ne.l var1, net.yz.k var2, net.u.r var3) {
      this.f = var1.G();
      this.Y = var1;
      this.Z = p.f.INTERACT_AT;
      this.w = var2;
      this.M = var3;
   }

   public void E(net.n2.h var1) throws IOException {
      this.f = var1.q();
      qo.y();
      this.Z = (p.f)var1.S(p.f.class);
      if(this.Z == p.f.INTERACT_AT) {
         this.M = new net.u.r((double)var1.readFloat(), (double)var1.readFloat(), (double)var1.readFloat());
      }

      if(this.Z == p.f.INTERACT || this.Z == p.f.INTERACT_AT) {
         this.w = (net.yz.k)var1.S(net.yz.k.class);
      }

   }

   public void O(net.n2.h var1) throws IOException {
      qo.y();
      var1.a(this.f);
      var1.A(this.Z);
      if(this.Z == p.f.INTERACT_AT) {
         var1.writeFloat((float)this.M.p);
         var1.writeFloat((float)this.M.H);
         var1.writeFloat((float)this.M.a);
      }

      if(this.Z == p.f.INTERACT || this.Z == p.f.INTERACT_AT) {
         var1.A(this.w);
      }

   }

   public void l(net.x.x var1) {
      var1.u(this);
   }

   @Nullable
   public net.ne.l g(net.yv.r var1) {
      return var1.S(this.f);
   }

   public p.f L() {
      return this.Z;
   }

   public net.yz.k b() {
      return this.w;
   }

   public net.u.r g() {
      return this.M;
   }

   public net.ne.l z() {
      return this.Y;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   public static enum f {
      INTERACT,
      ATTACK,
      INTERACT_AT;
   }
}
