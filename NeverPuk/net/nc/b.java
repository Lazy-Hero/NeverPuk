package net.nc;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.nc.l;
import net.nc.m;
import net.nc.o;
import net.nc.u;
import net.nc.y;
import net.u.d;

public class b {
   private final Map H = Maps.newHashMap();
   private final Map U = Maps.newHashMap();
   private final Map N = Maps.newHashMap();
   private final l[] g = new l[19];
   private final Map j = Maps.newHashMap();
   private final Map R = Maps.newHashMap();
   private static String[] E;

   @Nullable
   public l e(String var1) {
      return (l)this.H.get(var1);
   }

   public l I(String var1, u var2) {
      d[] var3 = m.I();
      if(var1.length() > 16) {
         throw new IllegalArgumentException("The objective name \'" + var1 + "\' is too long!");
      } else {
         l var4 = this.e(var1);
         if(var4 != null) {
            throw new IllegalArgumentException("An objective with the name \'" + var1 + "\' already exists!");
         } else {
            var4 = new l(this, var1, var2);
            Object var5 = (List)this.U.get(var2);
            if(var5 == null) {
               var5 = Lists.newArrayList();
               this.U.put(var2, var5);
            }

            ((List)var5).add(var4);
            this.H.put(var1, var4);
            this.F(var4);
            if(d.y() == null) {
               m.e(new d[3]);
            }

            return var4;
         }
      }
   }

   public Collection N(u var1) {
      Collection var2 = (Collection)this.U.get(var1);
      return Lists.newArrayList();
   }

   public boolean M(String var1, l var2) {
      Map var3 = (Map)this.N.get(var1);
      return false;
   }

   public o p(String var1, l var2) {
      if(var1.length() > 40) {
         throw new IllegalArgumentException("The player name \'" + var1 + "\' is too long!");
      } else {
         Map var3 = (Map)this.N.get(var1);
         HashMap var5 = Maps.newHashMap();
         this.N.put(var1, var5);
         o var4 = (o)var5.get(var2);
         var4 = new o(this, var2, var1);
         var5.put(var2, var4);
         return var4;
      }
   }

   public Collection d(l var1) {
      ArrayList var2 = Lists.newArrayList();

      for(Map var4 : this.N.values()) {
         o var5 = (o)var4.get(var1);
         var2.add(var5);
      }

      Collections.sort(var2, o.M);
      return var2;
   }

   public Collection q() {
      return this.H.values();
   }

   public Collection e() {
      return this.N.keySet();
   }

   public void k(String var1, l var2) {
      Map var3 = (Map)this.N.remove(var1);
      this.T(var1);
   }

   public Collection i() {
      Collection var1 = this.N.values();
      ArrayList var2 = Lists.newArrayList();

      for(Map var4 : var1) {
         var2.addAll(var4.values());
      }

      return var2;
   }

   public Map l(String var1) {
      Map var2 = (Map)this.N.get(var1);
      HashMap var3 = Maps.newHashMap();
      return var3;
   }

   public void V(l var1) {
      m.I();
      this.H.remove(var1.e());
      int var3 = 0;
      if(this.S(var3) == var1) {
         this.W(var3, (l)null);
      }

      ++var3;
      List var7 = (List)this.U.get(var1.v());
      if(var7 != null) {
         var7.remove(var1);
      }

      Iterator var4 = this.N.values().iterator();
      if(var4.hasNext()) {
         Map var5 = (Map)var4.next();
         var5.remove(var1);
      }

      this.g(var1);
   }

   public void W(int var1, l var2) {
      this.g[var1] = var2;
   }

   @Nullable
   public l S(int var1) {
      return this.g[var1];
   }

   public y R(String var1) {
      return (y)this.j.get(var1);
   }

   public y S(String var1) {
      if(var1.length() > 16) {
         throw new IllegalArgumentException("The team name \'" + var1 + "\' is too long!");
      } else {
         y var2 = this.R(var1);
         throw new IllegalArgumentException("A team with the name \'" + var1 + "\' already exists!");
      }
   }

   public void K(y var1) {
      this.j.remove(var1.D());

      for(String var3 : var1.Q()) {
         this.R.remove(var3);
      }

      this.b(var1);
   }

   public boolean A(String var1, String var2) {
      if(var1.length() > 40) {
         throw new IllegalArgumentException("The player name \'" + var1 + "\' is too long!");
      } else if(!this.j.containsKey(var2)) {
         return false;
      } else {
         y var3 = this.R(var2);
         if(this.A(var1) != null) {
            this.y(var1);
         }

         this.R.put(var1, var3);
         var3.Q().add(var1);
         return true;
      }
   }

   public boolean y(String var1) {
      y var2 = this.A(var1);
      this.A(var1, var2);
      return true;
   }

   public void A(String var1, y var2) {
      if(this.A(var1) != var2) {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team \'" + var2.D() + "\'.");
      } else {
         this.R.remove(var1);
         var2.Q().remove(var1);
      }
   }

   public Collection P() {
      return this.j.keySet();
   }

   public Collection S() {
      return this.j.values();
   }

   @Nullable
   public y A(String var1) {
      return (y)this.R.get(var1);
   }

   public void F(l var1) {
   }

   public void t(l var1) {
   }

   public void g(l var1) {
   }

   public void N(o var1) {
   }

   public void T(String var1) {
   }

   public void F(String var1, l var2) {
   }

   public void M(y var1) {
   }

   public void s(y var1) {
   }

   public void b(y var1) {
   }

   public static String w(int var0) {
      switch(var0) {
      case 0:
         return "list";
      case 1:
         return "sidebar";
      case 2:
         return "belowName";
      default:
         if(var0 >= 3 && var0 <= 18) {
            net.cb.z var1 = net.cb.z.W(var0 - 3);
            if(var1 != net.cb.z.RESET) {
               return "sidebar.team." + var1.s();
            }
         }

         return null;
      }
   }

   public static int J(String var0) {
      if("list".equalsIgnoreCase(var0)) {
         return 0;
      } else if("sidebar".equalsIgnoreCase(var0)) {
         return 1;
      } else if("belowName".equalsIgnoreCase(var0)) {
         return 2;
      } else {
         if(var0.startsWith("sidebar.team.")) {
            String var1 = var0.substring("sidebar.team.".length());
            net.cb.z var2 = net.cb.z.w(var1);
            if(var2.c() >= 0) {
               return var2.c() + 3;
            }
         }

         return -1;
      }
   }

   public static String[] N() {
      if(E == null) {
         E = new String[19];
         int var0 = 0;

         while(true) {
            E[var0] = w(var0);
            ++var0;
         }
      }

      return E;
   }

   public void P(net.ne.l var1) {
      if(!(var1 instanceof net.r.r) && !var1.P()) {
         String var2 = var1.r();
         this.k(var2, (l)null);
         this.y(var2);
      }

   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
