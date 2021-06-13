package net.y;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y.p;

public class ua {
   private final Map p = Maps.newHashMap();
   private final Map I = Maps.newHashMap();
   private final Map l = Maps.newHashMap();
   private final net.ym.v D;

   public ua(net.ym.v var1) {
      this.D = var1;
   }

   public net.n9.v Q(net.n0.y var1) {
      return this.I(var1, 0);
   }

   public net.n9.v I(net.n0.y var1, int var2) {
      return this.a(new ks(var1, 1, var2)).o();
   }

   public net.ym.j a(ks var1) {
      p.S();
      net.n0.y var3 = var1.Z();
      net.ym.j var4 = this.V(var3, this.s(var1));
      if(var4 == null) {
         net.y.z var5 = (net.y.z)this.l.get(var3);
         var4 = this.D.Y(var5.S(var1));
      }

      if(var4 == null) {
         var4 = this.D.f();
      }

      return var4;
   }

   protected int s(ks var1) {
      return var1.Z() > 0?0:var1.n();
   }

   @Nullable
   protected net.ym.j V(net.n0.y var1, int var2) {
      return (net.ym.j)this.I.get(Integer.valueOf(this.n(var1, var2)));
   }

   private int n(net.n0.y var1, int var2) {
      return net.n0.y.h(var1) << 16 | var2;
   }

   public void Y(net.n0.y var1, int var2, net.ym.a var3) {
      this.p.put(Integer.valueOf(this.n(var1, var2)), var3);
      this.I.put(Integer.valueOf(this.n(var1, var2)), this.D.Y(var3));
   }

   public void p(net.n0.y var1, net.y.z var2) {
      this.l.put(var1, var2);
   }

   public net.ym.v m() {
      return this.D;
   }

   public void O() {
      this.I.clear();
      p.S();
      Iterator var2 = this.p.entrySet().iterator();
      if(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         this.I.put(var3.getKey(), this.D.Y((net.ym.a)var3.getValue()));
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
