package net.ym;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.ym.j;
import net.ym.l;
import net.ym.s;
import net.yz.aq;

public class f implements j {
   private final int T;
   private final List f;
   private final j h;

   public f(List var1) {
      this.f = var1;
      this.T = net.yz.b.R(var1);
      this.h = ((f.l)var1.get(0)).h;
   }

   private j m(long var1) {
      return ((f.l)net.yz.b.Y(this.f, Math.abs((int)var1 >> 16) % this.T)).h;
   }

   public List h(@Nullable net.yw.n var1, @Nullable aq var2, long var3) {
      return this.m(var3).h(var1, var2, var3);
   }

   public boolean a() {
      return this.h.a();
   }

   public boolean M() {
      return this.h.M();
   }

   public boolean t() {
      return this.h.t();
   }

   public net.n9.v o() {
      return this.h.o();
   }

   public s D() {
      return this.h.D();
   }

   public l q() {
      return this.h.q();
   }

   static class l extends net.yz.b implements Comparable {
      protected final j h;

      public l(j var1, int var2) {
         super(var2);
         this.h = var1;
      }

      public int l(f.l var1) {
         return ComparisonChain.start().compare(var1.a, this.a).result();
      }

      public String toString() {
         return "MyWeighedRandomItem{weight=" + this.a + ", model=" + this.h + '}';
      }
   }

   public static class r {
      private final List n = Lists.newArrayList();

      public f.r l(j var1, int var2) {
         this.n.add(new f.l(var1, var2));
         return this;
      }

      public f u() {
         Collections.sort(this.n);
         return new f(this.n);
      }

      public j U() {
         return ((f.l)this.n.get(0)).h;
      }
   }
}
