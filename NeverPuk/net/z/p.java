package net.z;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.z.g;
import net.z.w;
import net.z.w_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class p extends net.z.z {
   private static final Logger h = LogManager.getLogger();
   private final w_ I;
   private final List P = Lists.newArrayList();
   private int M = -1;

   public p(w_ var1, net.nn.j var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.I = var1;
      this.V();
   }

   public void V() {
      g.C();
      net.cg.j var2 = this.s.l();
      List var3 = var2.Q();
      Collections.sort(var3);
      Iterator var4 = var3.iterator();
      if(var4.hasNext()) {
         net.cg.r var5 = (net.cg.r)var4.next();
         this.P.add(new w(this, var5, this.s.l()));
      }

   }

   public w M(int var1) {
      return (w)this.P.get(var1);
   }

   protected int V() {
      return this.P.size();
   }

   protected int I() {
      return super.I() + 20;
   }

   public int C() {
      return super.C() + 50;
   }

   public void U(int var1) {
      this.M = var1;
      this.I.b(this.l());
   }

   protected boolean z(int var1) {
      return var1 == this.M;
   }

   @Nullable
   public w l() {
      boolean var1 = g.B();
      return this.M >= 0 && this.M < this.V()?this.M(this.M):null;
   }

   public w_ L() {
      return this.I;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
