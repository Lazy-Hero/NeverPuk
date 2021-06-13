package net.v;

import java.util.BitSet;
import javax.annotation.Nullable;
import net.xn;
import net.cr.s;

public class c {
   protected final BitSet A = new BitSet();
   protected final BitSet r = new BitSet();
   protected boolean M;
   protected boolean f;

   public void N(c var1) {
      this.A.clear();
      this.r.clear();
      this.A.or(var1.A);
      this.r.or(var1.r);
   }

   public void D(s var1) {
      if(!var1.c()) {
         this.A.set(B(var1));
      }

   }

   public boolean Q(@Nullable s var1) {
      return this.A.get(B(var1));
   }

   public void I(s var1) {
      int var2 = B(var1);
      this.A.clear(var2);
      this.r.clear(var2);
   }

   protected static int B(@Nullable s var0) {
      return net.cr.n.v.D(var0);
   }

   public boolean s(s var1) {
      return this.r.get(B(var1));
   }

   public void b(s var1) {
      this.r.clear(B(var1));
   }

   public void c(s var1) {
      this.r.set(B(var1));
   }

   public boolean B() {
      return this.M;
   }

   public void v(boolean var1) {
      this.M = var1;
   }

   public boolean x() {
      return this.f;
   }

   public void U(boolean var1) {
      this.f = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
