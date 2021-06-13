package net.cp;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.pg;
import net.xc;
import net.xn;
import net.zy;
import net.cp.v;
import net.m.y;
import net.n2.k;
import net.nn.j;
import net.no.x;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h {
   private static final Logger c = LogManager.getLogger();
   private final j G;
   private final zy x = new zy();
   private final Map o = Maps.newHashMap();
   @Nullable
   private h.p p;
   @Nullable
   private xc e;

   public h(j var1) {
      this.G = var1;
   }

   public void Q(x var1) {
      String[] var2 = v.s();
      if(var1.H()) {
         this.x.k();
         this.o.clear();
      }

      this.x.t(var1.M());
      this.x.T(var1.d());
      Iterator var3 = var1.k().entrySet().iterator();
      if(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         xc var5 = this.x.j((m_)var4.getKey());
         if(var5 != null) {
            pg var6 = (pg)var4.getValue();
            var6.T(var5.G(), var5.A());
            this.o.put(var5, var6);
            if(this.p != null) {
               this.p.j(var5, var6);
            }

            if(!var1.H() && var6.l() && var5.y() != null && var5.y().J()) {
               this.G.J().a(new net.nd.d(var5));
            }
         }

         c.warn("Server informed client about progress for unknown advancement " + var4.getKey());
      }

   }

   public zy H() {
      return this.x;
   }

   public void Z(@Nullable xc var1, boolean var2) {
      net.yp.v var3 = this.G.d();
      var3.L((k)y.M(var1));
      if(this.e != var1) {
         this.e = var1;
         if(this.p != null) {
            this.p.u(var1);
         }
      }

   }

   public void P(@Nullable h.p var1) {
      this.p = var1;
      this.x.P(var1);

      for(Entry var3 : this.o.entrySet()) {
         var1.j((xc)var3.getKey(), (pg)var3.getValue());
      }

      var1.u(this.e);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public interface p extends zy.g {
      void j(xc var1, pg var2);

      void u(xc var1);
   }
}
