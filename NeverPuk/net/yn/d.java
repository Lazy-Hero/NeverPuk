package net.yn;

import com.google.common.base.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import net.b2;
import net.y_.o0;
import net.yn.w;
import net.yz.ai;

public abstract class d extends w implements net.ne.p {
   protected static final net.k.v Ib = net.k.n.q(d.class, net.k.y.g);
   protected static final net.k.v IM = net.k.n.q(d.class, net.k.y.e);
   protected o0 I9;

   public d(net.yv.r var1) {
      super(var1);
      this.H();
   }

   protected void g() {
      super.g();
      this.G.r(Ib, Byte.valueOf((byte)0));
      this.G.r(IM, Optional.absent());
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      if(this.q() == null) {
         var1.b("OwnerUUID", "");
      } else {
         var1.b("OwnerUUID", this.q().toString());
      }

      var1.c("Sitting", this.Ke());
   }

   public void o(net.nj.f var1) {
      net.yn.z.C();
      super.o(var1);
      if(var1.K("OwnerUUID", 8)) {
         String var3 = var1.J("OwnerUUID");
      }

      String var4 = var1.J("Owner");
      String var5 = net.n.k.T(this.E(), var4);
      if(!var5.isEmpty()) {
         this.w(UUID.fromString(var5));
         this.c(true);
      }

      if(this.I9 != null) {
         this.I9.n(var1.i("Sitting"));
      }

      this.A(var1.i("Sitting"));
   }

   public boolean p(net.r.r var1) {
      return !this.ln();
   }

   protected void P(boolean var1) {
      net.yn.z.C();
      ai var3 = ai.HEART;
      if(!var1) {
         var3 = ai.SMOKE_NORMAL;
      }

      int var4 = 0;
      double var5 = this.p.nextGaussian() * 0.02D;
      double var7 = this.p.nextGaussian() * 0.02D;
      double var9 = this.p.nextGaussian() * 0.02D;
      this.hl.n(var3, this.b + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, this.hS + 0.5D + (double)(this.p.nextFloat() * this.m), this.hr + (double)(this.p.nextFloat() * this.h9 * 2.0F) - (double)this.h9, var5, var7, var9, new int[0]);
      ++var4;
   }

   public void R(byte var1) {
      if(var1 == 7) {
         this.P(true);
      } else if(var1 == 6) {
         this.P(false);
      } else {
         super.R(var1);
      }

   }

   public boolean D() {
      return (((Byte)this.G.a(Ib)).byteValue() & 4) != 0;
   }

   public void c(boolean var1) {
      byte var2 = ((Byte)this.G.a(Ib)).byteValue();
      this.G.d(Ib, Byte.valueOf((byte)(var2 | 4)));
      this.H();
   }

   protected void H() {
   }

   public boolean Ke() {
      return (((Byte)this.G.a(Ib)).byteValue() & 1) != 0;
   }

   public void A(boolean var1) {
      byte var2 = ((Byte)this.G.a(Ib)).byteValue();
      this.G.d(Ib, Byte.valueOf((byte)(var2 | 1)));
   }

   @Nullable
   public UUID q() {
      return (UUID)((Optional)this.G.a(IM)).orNull();
   }

   public void w(@Nullable UUID var1) {
      this.G.d(IM, Optional.fromNullable(var1));
   }

   public void q(net.r.r var1) {
      this.c(true);
      this.w(var1.O());
      if(var1 instanceof net.r.h) {
         b2.t.I((net.r.h)((net.r.h)var1), (w)this);
      }

   }

   @Nullable
   public net.ne.a L() {
      UUID var1 = this.q();
      return null;
   }

   public boolean s(net.ne.a var1) {
      return var1 == this.L();
   }

   public o0 r() {
      return this.I9;
   }

   public boolean l(net.ne.a var1, net.ne.a var2) {
      return true;
   }

   public net.nc.m f() {
      if(this.D()) {
         net.ne.a var1 = this.L();
         return var1.f();
      } else {
         return super.f();
      }
   }

   public boolean M(net.ne.l var1) {
      if(this.D()) {
         net.ne.a var2 = this.L();
         return var1 == var2?true:var2.M(var1);
      } else {
         return super.M(var1);
      }
   }

   public void O(net.yz.z var1) {
      if(!this.hl.x && this.hl.N().b("showDeathMessages") && this.L() instanceof net.r.h) {
         this.L().r(this.a().A());
      }

      super.O(var1);
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }
}
