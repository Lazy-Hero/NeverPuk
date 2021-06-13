package net.y3;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.xn;
import net.y3.a;
import net.y3.n;
import net.y3.o;

public class r implements n {
   private final List M;
   private final int S;
   private final int p;
   private final int U;
   private final boolean h;

   public r(List var1, int var2, int var3, int var4, boolean var5) {
      this.M = var1;
      this.S = var2;
      this.p = var3;
      this.U = var4;
      this.h = var5;
   }

   public int Z() {
      return this.p;
   }

   public int M() {
      return this.S;
   }

   public int w() {
      return this.M.size();
   }

   public int T() {
      return this.U;
   }

   public boolean J() {
      return this.h;
   }

   private a Z(int var1) {
      return (a)this.M.get(var1);
   }

   public int e(int var1) {
      o.P();
      a var3 = this.Z(var1);
      return var3.d()?this.U:var3.Q();
   }

   public boolean d(int var1) {
      return !((a)this.M.get(var1)).d();
   }

   public int r(int var1) {
      return ((a)this.M.get(var1)).E();
   }

   public Set T() {
      HashSet var2 = Sets.newHashSet();
      o.P();
      Iterator var3 = this.M.iterator();
      if(var3.hasNext()) {
         a var4 = (a)var3.next();
         var2.add(Integer.valueOf(var4.E()));
      }

      return var2;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
