package net.yf;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import net.xn;
import net.yf.g;
import net.yf.o;
import net.yf.p;

public class d implements g {
   protected o U = new o();
   protected o i = new o();
   private final Function H;
   private final Function y;
   private final List V = Lists.newArrayList();
   private final Object2IntMap O = new Object2IntOpenHashMap();

   public d(Function var1, Function var2) {
      this.H = var1;
      this.y = var2;
   }

   public void k() {
      p.M();
      this.U = new o();
      this.i = new o();
      Iterator var2 = this.V.iterator();
      if(var2.hasNext()) {
         Object var3 = var2.next();
         this.n(var3);
      }

      this.U.e();
      this.i.e();
      if(net.u.d.y() == null) {
         p.d(false);
      }

   }

   public void p(Object var1) {
      this.O.put(var1, this.V.size());
      this.V.add(var1);
      this.n(var1);
   }

   private void n(Object var1) {
      ((Iterable)this.y.apply(var1)).forEach((var2) -> {
         this.i.j(var1, var2.toString().toLowerCase(Locale.ROOT));
      });
      ((Iterable)this.H.apply(var1)).forEach((var2) -> {
         this.U.j(var1, var2.toLowerCase(Locale.ROOT));
      });
   }

   public List z(String var1) {
      p.A();
      List var3 = this.U.s(var1);
      if(var1.indexOf(58) < 0) {
         return var3;
      } else {
         List var4 = this.i.s(var1);
         return (List)(var4.isEmpty()?var3:Lists.newArrayList(new d.w(var3.iterator(), var4.iterator(), this.O)));
      }
   }

   private static xn a(xn var0) {
      return var0;
   }

   static class w extends AbstractIterator {
      private final Iterator r;
      private final Iterator U;
      private final Object2IntMap A;
      private Object n;
      private Object Y;

      public w(Iterator var1, Iterator var2, Object2IntMap var3) {
         this.r = var1;
         this.U = var2;
         this.A = var3;
         this.n = var1.hasNext()?var1.next():null;
         this.Y = var2.hasNext()?var2.next():null;
      }

      protected Object computeNext() {
         boolean var1 = p.A();
         if(this.n == null && this.Y == null) {
            return this.endOfData();
         } else {
            if(this.n == this.Y) {
               boolean var2 = false;
            }

            if(this.n == null) {
               boolean var4 = true;
            }

            if(this.Y == null) {
               boolean var5 = true;
            }

            int var6 = Integer.compare(this.A.getInt(this.n), this.A.getInt(this.Y));
            Object var3 = this.n;
            if(var6 <= 0) {
               this.n = this.r.hasNext()?this.r.next():null;
            }

            if(var6 >= 0) {
               this.Y = this.U.hasNext()?this.U.next():null;
            }

            return var3;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
