package net.no;

import java.io.IOException;
import net.no.s8;
import net.yz.as;

public class sf implements net.n2.k {
   public sf.q N;
   public int w;
   public int t;
   public int q;
   public net.cb.t K;

   public sf() {
   }

   public sf(as var1, sf.q var2) {
      this(var1, var2, true);
   }

   public sf(as var1, sf.q var2, boolean var3) {
      s8.x();
      super();
      this.N = var2;
      net.ne.a var5 = var1.Y();
      switch(null.X[var2.ordinal()]) {
      case 1:
         this.q = var1.T();
         this.t = var5 == null?-1:var5.G();
      case 2:
         this.w = var1.M().G();
         this.t = var5 == null?-1:var5.G();
         this.K = var1.A();
         this.K = new net.cb.l("");
      default:
      }
   }

   public void E(net.n2.h var1) throws IOException {
      this.N = (sf.q)var1.S(sf.q.class);
      if(this.N == sf.q.END_COMBAT) {
         this.q = var1.q();
         this.t = var1.readInt();
      } else if(this.N == sf.q.ENTITY_DIED) {
         this.w = var1.q();
         this.t = var1.readInt();
         this.K = var1.g();
      }

   }

   public void O(net.n2.h var1) throws IOException {
      var1.A(this.N);
      if(this.N == sf.q.END_COMBAT) {
         var1.a(this.q);
         var1.writeInt(this.t);
      } else if(this.N == sf.q.ENTITY_DIED) {
         var1.a(this.w);
         var1.writeInt(this.t);
         var1.p(this.K);
      }

   }

   public void i(net.x.t var1) {
      var1.C(this);
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public static enum q {
      ENTER_COMBAT,
      END_COMBAT,
      ENTITY_DIED;
   }
}
