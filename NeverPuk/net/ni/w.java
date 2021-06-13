package net.ni;

import io.netty.buffer.ByteBuf;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;

public abstract class w implements net.nv.f {
   private static final SimpleDateFormat t = new SimpleDateFormat("HH:mm:ss");
   private long K = -1L;
   private boolean r = true;
   private int d;
   private boolean D = true;
   private net.cb.t J;
   private String W = "";
   private String R = "@";
   private final net.nv.l A = new net.nv.l();
   private static int[] o;

   public int n() {
      return this.d;
   }

   public void k(int var1) {
      this.d = var1;
   }

   public net.cb.t D() {
      return (net.cb.t)(this.J == null?new net.cb.l(""):this.J);
   }

   public net.nj.f E(net.nj.f var1) {
      var1.b("Command", this.W);
      var1.r("SuccessCount", this.d);
      var1.b("CustomName", this.R);
      var1.c("TrackOutput", this.D);
      if(this.J != null && this.D) {
         var1.b("LastOutput", net.cb.t.m(this.J));
      }

      var1.c("UpdateLastExecution", this.r);
      if(this.r && this.K > 0L) {
         var1.V("LastExecution", this.K);
      }

      this.A.y(var1);
      return var1;
   }

   public void f(net.nj.f var1) {
      this.W = var1.J("Command");
      this.d = var1.P("SuccessCount");
      if(var1.K("CustomName", 8)) {
         this.R = var1.J("CustomName");
      }

      if(var1.K("TrackOutput", 1)) {
         this.D = var1.i("TrackOutput");
      }

      if(var1.K("LastOutput", 8) && this.D) {
         this.J = net.cb.t.m(var1.J("LastOutput"));
      } else {
         this.J = null;
      }

      if(var1.G("UpdateLastExecution")) {
         this.r = var1.i("UpdateLastExecution");
      }

      if(this.r && var1.G("LastExecution")) {
         this.K = var1.P("LastExecution");
      } else {
         this.K = -1L;
      }

      this.A.S(var1);
   }

   public boolean n(int var1, String var2) {
      return var1 <= 2;
   }

   public void a(String var1) {
      this.W = var1;
      this.d = 0;
   }

   public String v() {
      return this.W;
   }

   public boolean K(net.yv.r var1) {
      int[] var2 = C();
      if(!var1.x && Long.compare(var1.y(), this.K) != 0) {
         if("Searge".equalsIgnoreCase(this.W)) {
            this.J = new net.cb.l("#itzlipofutzli");
            this.d = 1;
            return true;
         } else {
            net.nx.f var3 = this.E();
            if(var3 != null && var3.Z() && var3.X()) {
               this.J = null;
               this.d = var3.f().L(this, this.W);
            } else {
               this.d = 0;
            }

            if(this.r) {
               this.K = var1.y();
            }

            this.K = -1L;
            return true;
         }
      } else {
         return false;
      }
   }

   public String Q() {
      return this.R;
   }

   public void E(String var1) {
      this.R = var1;
   }

   public void r(net.cb.t var1) {
      if(this.D && this.T() != null && !this.T().x) {
         this.J = (new net.cb.l("[" + t.format(new Date()) + "] ")).h(var1);
         this.V();
      }

   }

   public boolean x() {
      net.nx.f var1 = this.E();
      return !var1.Z() || var1.w1[0].N().b("commandBlockOutput");
   }

   public void n(net.nv.l var1, int var2) {
      this.A.b(this.E(), this, var1, var2);
   }

   public abstract void V();

   public abstract int o();

   public abstract void L(ByteBuf var1);

   public void u(@Nullable net.cb.t var1) {
      this.J = var1;
   }

   public void f(boolean var1) {
      this.D = var1;
   }

   public boolean n() {
      return this.D;
   }

   public boolean y(net.r.r var1) {
      if(!var1.Vm()) {
         return false;
      } else {
         if(var1.T().x) {
            var1.X(this);
         }

         return true;
      }
   }

   public net.nv.l c() {
      return this.A;
   }

   static {
      M(new int[3]);
   }

   public static void M(int[] var0) {
      o = var0;
   }

   public static int[] C() {
      return o;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
