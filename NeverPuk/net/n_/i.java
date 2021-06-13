package net.n_;

import com.google.common.collect.ComparisonChain;
import net.xn;
import net.n_.f;
import net.ne.a;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class i implements Comparable {
   private static final Logger j = LogManager.getLogger();
   private final f L;
   private int N;
   private int y;
   private boolean T;
   private boolean R;
   private boolean V;
   private boolean f;
   private static boolean E;

   public i(f var1) {
      this(var1, 0, 0);
   }

   public i(f var1, int var2) {
      this(var1, var2, 0);
   }

   public i(f var1, int var2, int var3) {
      this(var1, var2, var3, false, true);
   }

   public i(f var1, int var2, int var3, boolean var4, boolean var5) {
      this.L = var1;
      this.N = var2;
      this.y = var3;
      this.R = var4;
      this.f = var5;
   }

   public i(i var1) {
      this.L = var1.L;
      this.N = var1.N;
      this.y = var1.y;
      this.R = var1.R;
      this.f = var1.f;
   }

   public void G(i var1) {
      if(this.L != var1.L) {
         j.warn("This method should only be called for matching effects!");
      }

      if(var1.y > this.y) {
         this.y = var1.y;
         this.N = var1.N;
      } else if(var1.y == this.y && this.N < var1.N) {
         this.N = var1.N;
      } else if(!var1.R && this.R) {
         this.R = var1.R;
      }

      this.f = var1.f;
   }

   public f i() {
      return this.L;
   }

   public int S() {
      return this.N;
   }

   public int d() {
      return this.y;
   }

   public boolean b() {
      return this.R;
   }

   public boolean q() {
      return this.f;
   }

   public boolean N(a var1) {
      if(this.N > 0) {
         if(this.L.w(this.N, this.y)) {
            this.i(var1);
         }

         this.X();
      }

      return this.N > 0;
   }

   private int X() {
      return --this.N;
   }

   public void i(a var1) {
      if(this.N > 0) {
         this.L.U(var1, this.y);
      }

   }

   public String V() {
      return this.L.s();
   }

   public String toString() {
      boolean var1 = z();
      if(this.y > 0) {
         (new StringBuilder()).append(this.V()).append(" x ").append(this.y + 1).append(", Duration: ").append(this.N).toString();
      }

      String var2 = this.V() + ", Duration: " + this.N;
      if(this.T) {
         var2 = var2 + ", Splash: true";
      }

      if(!this.f) {
         var2 = var2 + ", Particles: false";
      }

      return var2;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof i)) {
         return false;
      } else {
         i var2 = (i)var1;
         return this.N == var2.N && this.y == var2.y && this.T == var2.T && this.R == var2.R && this.L.equals(var2.L);
      }
   }

   public int hashCode() {
      int var1 = this.L.hashCode();
      var1 = 31 * var1 + this.N;
      var1 = 31 * var1 + this.y;
      var1 = 31 * var1 + (this.T?1:0);
      var1 = 31 * var1 + (this.R?1:0);
      return var1;
   }

   public net.nj.f t(net.nj.f var1) {
      var1.D("Id", (byte)f.N(this.i()));
      var1.D("Amplifier", (byte)this.d());
      var1.r("Duration", this.S());
      var1.c("Ambient", this.b());
      var1.c("ShowParticles", this.q());
      return var1;
   }

   public static i s(net.nj.f var0) {
      byte var1 = var0.R("Id");
      f var2 = f.Q(var1);
      return null;
   }

   public void j(boolean var1) {
      this.V = var1;
   }

   public boolean x() {
      return this.V;
   }

   public int J(i var1) {
      z();
      boolean var10001 = true;
      return this.S() > 32147 && var1.S() > 32147 || this.b() && var1.b()?ComparisonChain.start().compare(Boolean.valueOf(this.b()), Boolean.valueOf(var1.b())).compare(this.i().t(), var1.i().t()).result():ComparisonChain.start().compare(Boolean.valueOf(this.b()), Boolean.valueOf(var1.b())).compare(this.S(), var1.S()).compare(this.i().t(), var1.i().t()).result();
   }

   static {
      z(true);
   }

   public static void z(boolean var0) {
      E = var0;
   }

   public static boolean M() {
      return E;
   }

   public static boolean z() {
      boolean var0 = M();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
