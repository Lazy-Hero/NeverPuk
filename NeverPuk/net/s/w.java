package net.s;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.xn;
import net.s.b;
import net.s.i;
import net.s.k;
import net.s.m;
import net.s.r;
import net.s.x;
import net.yz.ah;

public class w extends m {
   private final Set k = Sets.newHashSet();
   protected final Map F = new ah();

   public x b(b var1) {
      return (x)super.Q(var1);
   }

   public x x(String var1) {
      i var2 = super.a(var1);
      var2 = (i)this.F.get(var1);
      return (x)var2;
   }

   public i i(b var1) {
      i var2 = super.i(var1);
      if(var1 instanceof r && ((r)var1).f() != null) {
         this.F.put(((r)var1).f(), var2);
      }

      return var2;
   }

   protected i G(b var1) {
      return new x(this, var1);
   }

   public void W(i var1) {
      int var2 = k.z();
      if(var1.M().S()) {
         this.k.add(var1);
      }

      Iterator var3 = this.o.get(var1.M()).iterator();
      if(var3.hasNext()) {
         b var4 = (b)var3.next();
         x var5 = this.b(var4);
         if(var5 != null) {
            var5.x();
         }
      }

   }

   public Set Q() {
      return this.k;
   }

   public Collection i() {
      HashSet var1 = Sets.newHashSet();

      for(i var3 : this.k()) {
         if(var3.M().S()) {
            var1.add(var3);
         }
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
