package net.nw;

import net.xn;
import net.a.t;
import net.nw.s;
import net.nw.v;
import net.nw.x;
import net.u.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class i {
   private static final Logger t = LogManager.getLogger();
   private final t X;
   private final x[] S = new x[v.s()];
   private x r;

   public i(t var1) {
      this.X = var1;
      this.D(v.E);
   }

   public void D(v var1) {
      d[] var2 = s.H();
      if(this.r == null || var1 != this.r.x()) {
         if(this.r != null) {
            this.r.o();
         }

         this.r = this.E(var1);
         if(!this.X.hl.x) {
            this.X.A().d(t.kf, Integer.valueOf(var1.a()));
         }

         t.debug("Dragon is now in phase {} on the {}", var1, this.X.hl.x?"client":"server");
         this.r.h();
      }

   }

   public x V() {
      return this.r;
   }

   public x E(v var1) {
      int var2 = var1.a();
      if(this.S[var2] == null) {
         this.S[var2] = var1.i(this.X);
      }

      return this.S[var2];
   }

   private static xn a(xn var0) {
      return var0;
   }
}
