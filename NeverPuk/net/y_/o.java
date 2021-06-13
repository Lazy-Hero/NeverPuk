package net.y_;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nullable;
import net.xn;
import net.y_.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class o {
   private static final Logger U = LogManager.getLogger();
   private final Set J = Sets.newLinkedHashSet();
   private final Set Z = Sets.newLinkedHashSet();
   private final net.yk.t u;
   private int l;
   private final int T = 3;
   private int z;

   public o(net.yk.t var1) {
      this.u = var1;
   }

   public void X(int var1, b var2) {
      this.J.add(new o.a(var1, var2));
   }

   public void e(b var1) {
      Iterator var2 = this.J.iterator();

      while(var2.hasNext()) {
         o.a var3 = (o.a)var2.next();
         b var4 = var3.a;
         if(var4 == var1) {
            if(var3.Q) {
               var3.Q = false;
               var3.a.C();
               this.Z.remove(var3);
            }

            var2.remove();
            return;
         }
      }

   }

   public void a() {
      b.E();
      this.u.K("goalSetup");
      int var10000 = this.l++;
      this.getClass();
      if(var10000 % 3 == 0) {
         Iterator var2 = this.J.iterator();
         if(var2.hasNext()) {
            label58: {
               o.a var3 = (o.a)var2.next();
               if(var3.Q) {
                  if(this.J(var3) && this.y(var3)) {
                     break label58;
                  }

                  var3.Q = false;
                  var3.a.C();
                  this.Z.remove(var3);
               }

               if(this.J(var3) && var3.a.f()) {
                  var3.Q = true;
                  var3.a.I();
                  this.Z.add(var3);
               }
            }
         }
      }

      Iterator var4 = this.Z.iterator();
      if(var4.hasNext()) {
         o.a var6 = (o.a)var4.next();
         if(!this.y(var6)) {
            var6.Q = false;
            var6.a.C();
            var4.remove();
         }
      }

      this.u.N();
      if(!this.Z.isEmpty()) {
         this.u.K("goalTick");
         var4 = this.Z.iterator();
         if(var4.hasNext()) {
            o.a var7 = (o.a)var4.next();
            var7.a.E();
         }

         this.u.N();
      }

   }

   private boolean y(o.a var1) {
      return var1.a.X();
   }

   private boolean J(o.a var1) {
      if(this.Z.isEmpty()) {
         return true;
      } else if(this.K(var1.a.C())) {
         return false;
      } else {
         for(o.a var3 : this.Z) {
            if(var3 != var1) {
               if(var1.h >= var3.h) {
                  if(!this.u(var1, var3)) {
                     return false;
                  }
               } else if(!var3.a.Q()) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private boolean u(o.a var1, o.a var2) {
      return (var1.a.C() & var2.a.C()) == 0;
   }

   public boolean K(int var1) {
      return (this.z & var1) > 0;
   }

   public void g(int var1) {
      this.z |= var1;
   }

   public void P(int var1) {
      this.z &= ~var1;
   }

   public void u(int var1, boolean var2) {
      this.P(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }

   class a {
      public final b a;
      public final int h;
      public boolean Q;

      public a(int var2, b var3) {
         this.h = var2;
         this.a = var3;
      }

      public boolean equals(@Nullable Object var1) {
         boolean var2 = b.q();
         return this == var1?true:var1 != null && this.getClass() == var1.getClass() && this.a.equals(((o.a)var1).a);
      }

      public int hashCode() {
         return this.a.hashCode();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
