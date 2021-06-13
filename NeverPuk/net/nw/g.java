package net.nw;

import javax.annotation.Nullable;
import net.xn;
import net.a.t;
import net.nw.s;
import net.nw.v;
import net.u.d;
import net.u.r;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class g extends s {
   private static final Logger E = LogManager.getLogger();
   private r g;
   private int Z;

   public g(t var1) {
      super(var1);
   }

   public void J() {
      d[] var1 = s.H();
      if(this.g == null) {
         E.warn("Aborting charge player as no target was set.");
         this.h.c().D(v.z);
      }

      if(this.Z > 0 && this.Z++ >= 10) {
         this.h.c().D(v.z);
      }

      double var2 = this.g.s(this.h.b, this.h.hS, this.h.hr);
      if(Double.compare(var2, 100.0D) < 0 || var2 > 22500.0D || this.h.t || this.h.u) {
         ++this.Z;
      }

   }

   public void h() {
      this.g = null;
      this.Z = 0;
   }

   public void A(r var1) {
      this.g = var1;
   }

   public float H() {
      return 3.0F;
   }

   @Nullable
   public r Y() {
      return this.g;
   }

   public v x() {
      return v.Y;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
