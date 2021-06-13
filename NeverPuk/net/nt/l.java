package net.nt;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import net.nt.x;

public class l extends net.nv.h {
   public String k() {
      return "scoreboard";
   }

   public int o() {
      return 2;
   }

   public String K(net.nv.f var1) {
      return "commands.scoreboard.usage";
   }

   public void c(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      net.u.d[] var4 = x.O();
      if(!this.k(var1, var2, var3)) {
         if(var3.length < 1) {
            throw new net.nv.x("commands.scoreboard.usage", new Object[0]);
         }

         if("objectives".equalsIgnoreCase(var3[0])) {
            if(var3.length == 1) {
               throw new net.nv.x("commands.scoreboard.objectives.usage", new Object[0]);
            }

            if("list".equalsIgnoreCase(var3[1])) {
               this.C(var2, var1);
            }

            if("add".equalsIgnoreCase(var3[1])) {
               if(var3.length < 4) {
                  throw new net.nv.x("commands.scoreboard.objectives.add.usage", new Object[0]);
               }

               this.G(var2, var3, 2, var1);
            }

            if("remove".equalsIgnoreCase(var3[1])) {
               if(var3.length != 3) {
                  throw new net.nv.x("commands.scoreboard.objectives.remove.usage", new Object[0]);
               }

               this.x(var2, var3[2], var1);
            }

            if(!"setdisplay".equalsIgnoreCase(var3[1])) {
               throw new net.nv.x("commands.scoreboard.objectives.usage", new Object[0]);
            }

            if(var3.length != 3 && var3.length != 4) {
               throw new net.nv.x("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
            }

            this.H(var2, var3, 2, var1);
         }

         if("players".equalsIgnoreCase(var3[0])) {
            if(var3.length == 1) {
               throw new net.nv.x("commands.scoreboard.players.usage", new Object[0]);
            }

            if("list".equalsIgnoreCase(var3[1])) {
               if(var3.length > 3) {
                  throw new net.nv.x("commands.scoreboard.players.list.usage", new Object[0]);
               }

               this.u(var2, var3, 2, var1);
            }

            if("add".equalsIgnoreCase(var3[1])) {
               if(var3.length < 5) {
                  throw new net.nv.x("commands.scoreboard.players.add.usage", new Object[0]);
               }

               this.e(var2, var3, 2, var1);
            }

            if("remove".equalsIgnoreCase(var3[1])) {
               if(var3.length < 5) {
                  throw new net.nv.x("commands.scoreboard.players.remove.usage", new Object[0]);
               }

               this.e(var2, var3, 2, var1);
            }

            if("set".equalsIgnoreCase(var3[1])) {
               if(var3.length < 5) {
                  throw new net.nv.x("commands.scoreboard.players.set.usage", new Object[0]);
               }

               this.e(var2, var3, 2, var1);
            }

            if("reset".equalsIgnoreCase(var3[1])) {
               if(var3.length != 3 && var3.length != 4) {
                  throw new net.nv.x("commands.scoreboard.players.reset.usage", new Object[0]);
               }

               this.X(var2, var3, 2, var1);
            }

            if("enable".equalsIgnoreCase(var3[1])) {
               if(var3.length != 4) {
                  throw new net.nv.x("commands.scoreboard.players.enable.usage", new Object[0]);
               }

               this.Q(var2, var3, 2, var1);
            }

            if("test".equalsIgnoreCase(var3[1])) {
               if(var3.length != 5 && var3.length != 6) {
                  throw new net.nv.x("commands.scoreboard.players.test.usage", new Object[0]);
               }

               this.d(var2, var3, 2, var1);
            }

            if("operation".equalsIgnoreCase(var3[1])) {
               if(var3.length != 7) {
                  throw new net.nv.x("commands.scoreboard.players.operation.usage", new Object[0]);
               }

               this.A(var2, var3, 2, var1);
            }

            if(!"tag".equalsIgnoreCase(var3[1])) {
               throw new net.nv.x("commands.scoreboard.players.usage", new Object[0]);
            }

            if(var3.length < 4) {
               throw new net.nv.x("commands.scoreboard.players.tag.usage", new Object[0]);
            }

            this.y(var1, var2, var3, 2);
         }

         if(!"teams".equalsIgnoreCase(var3[0])) {
            throw new net.nv.x("commands.scoreboard.usage", new Object[0]);
         }

         if(var3.length == 1) {
            throw new net.nv.x("commands.scoreboard.teams.usage", new Object[0]);
         }

         if("list".equalsIgnoreCase(var3[1])) {
            if(var3.length > 3) {
               throw new net.nv.x("commands.scoreboard.teams.list.usage", new Object[0]);
            }

            this.o(var2, var3, 2, var1);
         }

         if("add".equalsIgnoreCase(var3[1])) {
            if(var3.length < 3) {
               throw new net.nv.x("commands.scoreboard.teams.add.usage", new Object[0]);
            }

            this.t(var2, var3, 2, var1);
         }

         if("remove".equalsIgnoreCase(var3[1])) {
            if(var3.length != 3) {
               throw new net.nv.x("commands.scoreboard.teams.remove.usage", new Object[0]);
            }

            this.k(var2, var3, 2, var1);
         }

         if("empty".equalsIgnoreCase(var3[1])) {
            if(var3.length != 3) {
               throw new net.nv.x("commands.scoreboard.teams.empty.usage", new Object[0]);
            }

            this.B(var2, var3, 2, var1);
         }

         if("join".equalsIgnoreCase(var3[1])) {
            if(var3.length < 4 && (var3.length != 3 || !(var2 instanceof net.r.r))) {
               throw new net.nv.x("commands.scoreboard.teams.join.usage", new Object[0]);
            }

            this.m(var2, var3, 2, var1);
         }

         if("leave".equalsIgnoreCase(var3[1])) {
            if(var3.length < 3 && !(var2 instanceof net.r.r)) {
               throw new net.nv.x("commands.scoreboard.teams.leave.usage", new Object[0]);
            }

            this.C(var2, var3, 2, var1);
         }

         if(!"option".equalsIgnoreCase(var3[1])) {
            throw new net.nv.x("commands.scoreboard.teams.usage", new Object[0]);
         }

         if(var3.length != 4 && var3.length != 5) {
            throw new net.nv.x("commands.scoreboard.teams.option.usage", new Object[0]);
         }

         this.J(var2, var3, 2, var1);
      }

   }

   private boolean k(net.nx.f var1, net.nv.f var2, String[] var3) throws net.nv.t {
      boolean var4 = true;

      for(int var5 = 0; var5 < var3.length; ++var5) {
         if(this.T(var3, var5) && "*".equals(var3[var5])) {
            throw new net.nv.t("commands.scoreboard.noMultiWildcard", new Object[0]);
         }
      }

      return false;
   }

   protected net.nc.b y(net.nx.f var1) {
      return var1.n(0).J();
   }

   protected net.nc.l h(String var1, boolean var2, net.nx.f var3) throws net.nv.t {
      net.nc.b var4 = this.y(var3);
      net.nc.l var5 = var4.e(var1);
      throw new net.nv.t("commands.scoreboard.objectiveNotFound", new Object[]{var1});
   }

   protected net.nc.y m(String var1, net.nx.f var2) throws net.nv.t {
      net.nc.b var3 = this.y(var2);
      net.nc.y var4 = var3.R(var1);
      throw new net.nv.t("commands.scoreboard.teamNotFound", new Object[]{var1});
   }

   protected void G(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      String var6 = var2[var3++];
      this.y(var4);
      net.nc.u var8 = (net.nc.u)net.nc.u.J.get(var6);
      throw new net.nv.x("commands.scoreboard.objectives.add.wrongType", new Object[]{var6});
   }

   protected void t(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      String var5 = var2[var3++];
      net.nc.b var6 = this.y(var4);
      if(var6.R(var5) != null) {
         throw new net.nv.t("commands.scoreboard.teams.add.alreadyExists", new Object[]{var5});
      } else if(var5.length() > 16) {
         throw new net.nv.v("commands.scoreboard.teams.add.tooLong", new Object[]{var5, Integer.valueOf(16)});
      } else if(var5.isEmpty()) {
         throw new net.nv.x("commands.scoreboard.teams.add.usage", new Object[0]);
      } else {
         if(var2.length > var3) {
            String var7 = O(var1, var2, var3).l();
            if(var7.length() > 32) {
               throw new net.nv.v("commands.scoreboard.teams.add.displayTooLong", new Object[]{var7, Integer.valueOf(32)});
            }

            if(var7.isEmpty()) {
               var6.S(var5);
            } else {
               var6.S(var5).q(var7);
            }
         } else {
            var6.S(var5);
         }

         g(var1, this, "commands.scoreboard.teams.add.success", new Object[]{var5});
      }
   }

   protected void J(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      net.nc.y var5 = this.m(var2[var3++], var4);
      String var6 = var2[var3++].toLowerCase(Locale.ROOT);
      if(!"color".equalsIgnoreCase(var6) && !"friendlyfire".equalsIgnoreCase(var6) && !"seeFriendlyInvisibles".equalsIgnoreCase(var6) && !"nametagVisibility".equalsIgnoreCase(var6) && !"deathMessageVisibility".equalsIgnoreCase(var6) && !"collisionRule".equalsIgnoreCase(var6)) {
         throw new net.nv.x("commands.scoreboard.teams.option.usage", new Object[0]);
      } else if(var2.length == 4) {
         if("color".equalsIgnoreCase(var6)) {
            throw new net.nv.x("commands.scoreboard.teams.option.noValue", new Object[]{var6, O(net.cb.z.s(true, false))});
         } else if(!"friendlyfire".equalsIgnoreCase(var6) && !"seeFriendlyInvisibles".equalsIgnoreCase(var6)) {
            if(!"nametagVisibility".equalsIgnoreCase(var6) && !"deathMessageVisibility".equalsIgnoreCase(var6)) {
               if("collisionRule".equalsIgnoreCase(var6)) {
                  throw new net.nv.x("commands.scoreboard.teams.option.noValue", new Object[]{var6, g(net.nc.m.P())});
               } else {
                  throw new net.nv.x("commands.scoreboard.teams.option.usage", new Object[0]);
               }
            } else {
               throw new net.nv.x("commands.scoreboard.teams.option.noValue", new Object[]{var6, g(net.nc.m.z())});
            }
         } else {
            throw new net.nv.x("commands.scoreboard.teams.option.noValue", new Object[]{var6, O(Arrays.asList(new String[]{"true", "false"}))});
         }
      } else {
         String var7 = var2[var3];
         if("color".equalsIgnoreCase(var6)) {
            net.cb.z var8 = net.cb.z.w(var7);
            if(var8.w()) {
               throw new net.nv.x("commands.scoreboard.teams.option.noValue", new Object[]{var6, O(net.cb.z.s(true, false))});
            }

            var5.s(var8);
            var5.J(var8.toString());
            var5.u(net.cb.z.RESET.toString());
         } else if("friendlyfire".equalsIgnoreCase(var6)) {
            if(!"true".equalsIgnoreCase(var7) && !"false".equalsIgnoreCase(var7)) {
               throw new net.nv.x("commands.scoreboard.teams.option.noValue", new Object[]{var6, O(Arrays.asList(new String[]{"true", "false"}))});
            }

            var5.D("true".equalsIgnoreCase(var7));
         } else if("seeFriendlyInvisibles".equalsIgnoreCase(var6)) {
            if(!"true".equalsIgnoreCase(var7) && !"false".equalsIgnoreCase(var7)) {
               throw new net.nv.x("commands.scoreboard.teams.option.noValue", new Object[]{var6, O(Arrays.asList(new String[]{"true", "false"}))});
            }

            var5.a("true".equalsIgnoreCase(var7));
         } else {
            if("nametagVisibility".equalsIgnoreCase(var6)) {
               net.nc.m var13 = net.nc.m.M(var7);
               throw new net.nv.x("commands.scoreboard.teams.option.noValue", new Object[]{var6, g(net.nc.m.z())});
            }

            if("deathMessageVisibility".equalsIgnoreCase(var6)) {
               net.nc.m var12 = net.nc.m.M(var7);
               throw new net.nv.x("commands.scoreboard.teams.option.noValue", new Object[]{var6, g(net.nc.m.z())});
            }

            if("collisionRule".equalsIgnoreCase(var6)) {
               net.nc.m var11 = net.nc.m.y(var7);
               throw new net.nv.x("commands.scoreboard.teams.option.noValue", new Object[]{var6, g(net.nc.m.P())});
            }
         }

         g(var1, this, "commands.scoreboard.teams.option.success", new Object[]{var6, var5.D(), var7});
      }
   }

   protected void k(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      net.nc.b var5 = this.y(var4);
      net.nc.y var6 = this.m(var2[var3], var4);
      var5.K(var6);
      g(var1, this, "commands.scoreboard.teams.remove.success", new Object[]{var6.D()});
   }

   protected void o(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      net.nc.b var5 = this.y(var4);
      if(var2.length > var3) {
         net.nc.y var10 = this.m(var2[var3], var4);
      } else {
         Collection var6 = var5.S();
         var1.n(net.nv.l.QUERY_RESULT, var6.size());
         if(var6.isEmpty()) {
            throw new net.nv.t("commands.scoreboard.teams.list.empty", new Object[0]);
         } else {
            net.cb.h var7 = new net.cb.h("commands.scoreboard.teams.list.count", new Object[]{Integer.valueOf(var6.size())});
            var7.E().i(net.cb.z.DARK_GREEN);
            var1.r(var7);

            for(net.nc.y var9 : var6) {
               var1.r(new net.cb.h("commands.scoreboard.teams.list.entry", new Object[]{var9.D(), var9.a(), Integer.valueOf(var9.Q().size())}));
            }

         }
      }
   }

   protected void m(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      net.nc.b var5 = this.y(var4);
      String var6 = var2[var3++];
      HashSet var7 = Sets.newHashSet();
      HashSet var8 = Sets.newHashSet();
      if(var1 instanceof net.r.r && var3 == var2.length) {
         String var14 = x(var1).Q();
         if(var5.A(var14, var6)) {
            var7.add(var14);
         } else {
            var8.add(var14);
         }
      } else {
         while(var3 < var2.length) {
            String var9 = var2[var3++];
            if(net.nv.m.q(var9)) {
               for(net.ne.l var11 : a(var4, var1, var9)) {
                  String var12 = M(var4, var1, var11.r());
                  if(var5.A(var12, var6)) {
                     var7.add(var12);
                  } else {
                     var8.add(var12);
                  }
               }
            } else {
               String var10 = M(var4, var1, var9);
               if(var5.A(var10, var6)) {
                  var7.add(var10);
               } else {
                  var8.add(var10);
               }
            }
         }
      }

      if(!var7.isEmpty()) {
         var1.n(net.nv.l.AFFECTED_ENTITIES, var7.size());
         g(var1, this, "commands.scoreboard.teams.join.success", new Object[]{Integer.valueOf(var7.size()), var6, g(var7.toArray(new String[var7.size()]))});
      }

      if(!var8.isEmpty()) {
         throw new net.nv.t("commands.scoreboard.teams.join.failure", new Object[]{Integer.valueOf(var8.size()), var6, g(var8.toArray(new String[var8.size()]))});
      }
   }

   protected void C(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      net.nc.b var5 = this.y(var4);
      HashSet var6 = Sets.newHashSet();
      HashSet var7 = Sets.newHashSet();
      if(var1 instanceof net.r.r && var3 == var2.length) {
         String var12 = x(var1).Q();
         if(var5.y(var12)) {
            var6.add(var12);
         } else {
            var7.add(var12);
         }
      } else {
         while(var3 < var2.length) {
            String var8 = var2[var3++];
            if(net.nv.m.q(var8)) {
               for(net.ne.l var10 : a(var4, var1, var8)) {
                  String var11 = M(var4, var1, var10.r());
                  if(var5.y(var11)) {
                     var6.add(var11);
                  } else {
                     var7.add(var11);
                  }
               }
            } else {
               String var9 = M(var4, var1, var8);
               if(var5.y(var9)) {
                  var6.add(var9);
               } else {
                  var7.add(var9);
               }
            }
         }
      }

      if(!var6.isEmpty()) {
         var1.n(net.nv.l.AFFECTED_ENTITIES, var6.size());
         g(var1, this, "commands.scoreboard.teams.leave.success", new Object[]{Integer.valueOf(var6.size()), g(var6.toArray(new String[var6.size()]))});
      }

      if(!var7.isEmpty()) {
         throw new net.nv.t("commands.scoreboard.teams.leave.failure", new Object[]{Integer.valueOf(var7.size()), g(var7.toArray(new String[var7.size()]))});
      }
   }

   protected void B(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      net.nc.b var5 = this.y(var4);
      net.nc.y var6 = this.m(var2[var3], var4);
      ArrayList var7 = Lists.newArrayList(var6.Q());
      var1.n(net.nv.l.AFFECTED_ENTITIES, var7.size());
      if(var7.isEmpty()) {
         throw new net.nv.t("commands.scoreboard.teams.empty.alreadyEmpty", new Object[]{var6.D()});
      } else {
         for(String var9 : var7) {
            var5.A(var9, var6);
         }

         g(var1, this, "commands.scoreboard.teams.empty.success", new Object[]{Integer.valueOf(var7.size()), var6.D()});
      }
   }

   protected void x(net.nv.f var1, String var2, net.nx.f var3) throws net.nv.t {
      net.nc.b var4 = this.y(var3);
      net.nc.l var5 = this.h(var2, false, var3);
      var4.V(var5);
      g(var1, this, "commands.scoreboard.objectives.remove.success", new Object[]{var2});
   }

   protected void C(net.nv.f var1, net.nx.f var2) throws net.nv.t {
      net.nc.b var3 = this.y(var2);
      Collection var4 = var3.q();
      if(var4.isEmpty()) {
         throw new net.nv.t("commands.scoreboard.objectives.list.empty", new Object[0]);
      } else {
         net.cb.h var5 = new net.cb.h("commands.scoreboard.objectives.list.count", new Object[]{Integer.valueOf(var4.size())});
         var5.E().i(net.cb.z.DARK_GREEN);
         var1.r(var5);

         for(net.nc.l var7 : var4) {
            var1.r(new net.cb.h("commands.scoreboard.objectives.list.entry", new Object[]{var7.e(), var7.a(), var7.v().k()}));
         }

      }
   }

   protected void H(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      this.y(var4);
      String var6 = var2[var3++];
      int var7 = net.nc.b.J(var6);
      Object var10000 = null;
      if(var2.length == 4) {
         this.h(var2[var3], false, var4);
      }

      throw new net.nv.t("commands.scoreboard.objectives.setdisplay.invalidSlot", new Object[]{var6});
   }

   protected void u(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      net.nc.b var5 = this.y(var4);
      if(var2.length > var3) {
         String var6 = M(var4, var1, var2[var3]);
         Map var7 = var5.l(var6);
         var1.n(net.nv.l.QUERY_RESULT, var7.size());
         if(var7.isEmpty()) {
            throw new net.nv.t("commands.scoreboard.players.list.player.empty", new Object[]{var6});
         }

         net.cb.h var8 = new net.cb.h("commands.scoreboard.players.list.player.count", new Object[]{Integer.valueOf(var7.size()), var6});
         var8.E().i(net.cb.z.DARK_GREEN);
         var1.r(var8);

         for(net.nc.o var10 : var7.values()) {
            var1.r(new net.cb.h("commands.scoreboard.players.list.player.entry", new Object[]{Integer.valueOf(var10.W()), var10.M().a(), var10.M().e()}));
         }
      } else {
         Collection var11 = var5.e();
         var1.n(net.nv.l.QUERY_RESULT, var11.size());
         if(var11.isEmpty()) {
            throw new net.nv.t("commands.scoreboard.players.list.empty", new Object[0]);
         }

         net.cb.h var12 = new net.cb.h("commands.scoreboard.players.list.count", new Object[]{Integer.valueOf(var11.size())});
         var12.E().i(net.cb.z.DARK_GREEN);
         var1.r(var12);
         var1.r(new net.cb.l(g(var11.toArray())));
      }

   }

   protected void e(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      String var5 = var2[var3 - 1];
      int var6 = var3;
      String var7 = M(var4, var1, var2[var3++]);
      if(var7.length() > 40) {
         throw new net.nv.v("commands.scoreboard.players.name.tooLong", new Object[]{var7, Integer.valueOf(40)});
      } else {
         net.nc.l var8 = this.h(var2[var3++], true, var4);
         int var9 = "set".equalsIgnoreCase(var5)?j(var2[var3++]):h(var2[var3++], 0);
         if(var2.length > var3) {
            net.ne.l var10 = w(var4, var1, var2[var6]);
            net.nj.f var11 = net.nj.g.c(N(var2, var3));
            net.nj.f var12 = c(var10);
            if(!net.nj.e.v(var11, var12, true)) {
               throw new net.nv.t("commands.scoreboard.players.set.tagMismatch", new Object[]{var7});
            }
         }

         net.nc.b var16 = this.y(var4);
         net.nc.o var17 = var16.p(var7, var8);
         if("set".equalsIgnoreCase(var5)) {
            var17.A(var9);
         } else if("add".equalsIgnoreCase(var5)) {
            var17.R(var9);
         } else {
            var17.P(var9);
         }

         g(var1, this, "commands.scoreboard.players.set.success", new Object[]{var8.e(), var7, Integer.valueOf(var17.W())});
      }
   }

   protected void X(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      net.nc.b var5 = this.y(var4);
      String var6 = M(var4, var1, var2[var3++]);
      if(var2.length > var3) {
         net.nc.l var7 = this.h(var2[var3++], false, var4);
         var5.k(var6, var7);
         g(var1, this, "commands.scoreboard.players.resetscore.success", new Object[]{var7.e(), var6});
      } else {
         var5.k(var6, (net.nc.l)null);
         g(var1, this, "commands.scoreboard.players.reset.success", new Object[]{var6});
      }

   }

   protected void Q(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      net.nc.b var5 = this.y(var4);
      String var6 = V(var4, var1, var2[var3++]);
      if(var6.length() > 40) {
         throw new net.nv.v("commands.scoreboard.players.name.tooLong", new Object[]{var6, Integer.valueOf(40)});
      } else {
         net.nc.l var7 = this.h(var2[var3], false, var4);
         if(var7.v() != net.nc.u.z) {
            throw new net.nv.t("commands.scoreboard.players.enable.noTrigger", new Object[]{var7.e()});
         } else {
            net.nc.o var8 = var5.p(var6, var7);
            var8.b(false);
            g(var1, this, "commands.scoreboard.players.enable.success", new Object[]{var7.e(), var6});
         }
      }
   }

   protected void d(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      net.nc.b var5 = this.y(var4);
      String var6 = M(var4, var1, var2[var3++]);
      if(var6.length() > 40) {
         throw new net.nv.v("commands.scoreboard.players.name.tooLong", new Object[]{var6, Integer.valueOf(40)});
      } else {
         net.nc.l var7 = this.h(var2[var3++], false, var4);
         if(!var5.M(var6, var7)) {
            throw new net.nv.t("commands.scoreboard.players.test.notFound", new Object[]{var7.e(), var6});
         } else {
            int var8 = var2[var3].equals("*")?Integer.MIN_VALUE:j(var2[var3]);
            ++var3;
            int var9 = var3 < var2.length && !var2[var3].equals("*")?h(var2[var3], var8):Integer.MAX_VALUE;
            net.nc.o var10 = var5.p(var6, var7);
            if(var10.W() >= var8 && var10.W() <= var9) {
               g(var1, this, "commands.scoreboard.players.test.success", new Object[]{Integer.valueOf(var10.W()), Integer.valueOf(var8), Integer.valueOf(var9)});
            } else {
               throw new net.nv.t("commands.scoreboard.players.test.failed", new Object[]{Integer.valueOf(var10.W()), Integer.valueOf(var8), Integer.valueOf(var9)});
            }
         }
      }
   }

   protected void A(net.nv.f var1, String[] var2, int var3, net.nx.f var4) throws net.nv.t {
      net.nc.b var5 = this.y(var4);
      String var6 = M(var4, var1, var2[var3++]);
      net.nc.l var7 = this.h(var2[var3++], true, var4);
      String var8 = var2[var3++];
      String var9 = M(var4, var1, var2[var3++]);
      net.nc.l var10 = this.h(var2[var3], false, var4);
      if(var6.length() > 40) {
         throw new net.nv.v("commands.scoreboard.players.name.tooLong", new Object[]{var6, Integer.valueOf(40)});
      } else if(var9.length() > 40) {
         throw new net.nv.v("commands.scoreboard.players.name.tooLong", new Object[]{var9, Integer.valueOf(40)});
      } else {
         net.nc.o var11 = var5.p(var6, var7);
         if(!var5.M(var9, var10)) {
            throw new net.nv.t("commands.scoreboard.players.operation.notFound", new Object[]{var10.e(), var9});
         } else {
            net.nc.o var12 = var5.p(var9, var10);
            if("+=".equals(var8)) {
               var11.A(var11.W() + var12.W());
            } else if("-=".equals(var8)) {
               var11.A(var11.W() - var12.W());
            } else if("*=".equals(var8)) {
               var11.A(var11.W() * var12.W());
            } else if("/=".equals(var8)) {
               if(var12.W() != 0) {
                  var11.A(var11.W() / var12.W());
               }
            } else if("%=".equals(var8)) {
               if(var12.W() != 0) {
                  var11.A(var11.W() % var12.W());
               }
            } else if("=".equals(var8)) {
               var11.A(var12.W());
            } else if("<".equals(var8)) {
               var11.A(Math.min(var11.W(), var12.W()));
            } else if(">".equals(var8)) {
               var11.A(Math.max(var11.W(), var12.W()));
            } else {
               if(!"><".equals(var8)) {
                  throw new net.nv.t("commands.scoreboard.players.operation.invalidOperation", new Object[]{var8});
               }

               int var13 = var11.W();
               var11.A(var12.W());
               var12.A(var13);
            }

            g(var1, this, "commands.scoreboard.players.operation.success", new Object[0]);
         }
      }
   }

   protected void y(net.nx.f var1, net.nv.f var2, String[] var3, int var4) throws net.nv.t {
      String var5 = M(var1, var2, var3[var4]);
      net.ne.l var6 = w(var1, var2, var3[var4++]);
      String var7 = var3[var4++];
      Set var8 = var6.C();
      if("list".equals(var7)) {
         if(!var8.isEmpty()) {
            net.cb.h var9 = new net.cb.h("commands.scoreboard.players.tag.list", new Object[]{var5});
            var9.E().i(net.cb.z.DARK_GREEN);
            var2.r(var9);
            var2.r(new net.cb.l(g(var8.toArray())));
         }

         var2.n(net.nv.l.QUERY_RESULT, var8.size());
      } else {
         if(var3.length < 5) {
            throw new net.nv.x("commands.scoreboard.players.tag.usage", new Object[0]);
         }

         String var15 = var3[var4++];
         if(var3.length > var4) {
            net.nj.f var10 = net.nj.g.c(N(var3, var4));
            net.nj.f var11 = c(var6);
            if(!net.nj.e.v(var10, var11, true)) {
               throw new net.nv.t("commands.scoreboard.players.tag.tagMismatch", new Object[]{var5});
            }
         }

         if("add".equals(var7)) {
            if(!var6.r(var15)) {
               throw new net.nv.t("commands.scoreboard.players.tag.tooMany", new Object[]{Integer.valueOf(1024)});
            }

            g(var2, this, "commands.scoreboard.players.tag.success.add", new Object[]{var15});
         } else {
            if(!"remove".equals(var7)) {
               throw new net.nv.x("commands.scoreboard.players.tag.usage", new Object[0]);
            }

            if(!var6.t(var15)) {
               throw new net.nv.t("commands.scoreboard.players.tag.notFound", new Object[]{var15});
            }

            g(var2, this, "commands.scoreboard.players.tag.success.remove", new Object[]{var15});
         }
      }

   }

   public List E(net.nx.f var1, net.nv.f var2, String[] var3, @Nullable net.u.j var4) {
      if(var3.length == 1) {
         return D(var3, new String[]{"objectives", "players", "teams"});
      } else {
         if("objectives".equalsIgnoreCase(var3[0])) {
            if(var3.length == 2) {
               return D(var3, new String[]{"list", "add", "remove", "setdisplay"});
            }

            if("add".equalsIgnoreCase(var3[1])) {
               if(var3.length == 4) {
                  Set var5 = net.nc.u.J.keySet();
                  return o(var3, var5);
               }
            } else if("remove".equalsIgnoreCase(var3[1])) {
               if(var3.length == 3) {
                  return o(var3, this.Q(false, var1));
               }
            } else if("setdisplay".equalsIgnoreCase(var3[1])) {
               if(var3.length == 3) {
                  return D(var3, net.nc.b.N());
               }

               if(var3.length == 4) {
                  return o(var3, this.Q(false, var1));
               }
            }
         } else if("players".equalsIgnoreCase(var3[0])) {
            if(var3.length == 2) {
               return D(var3, new String[]{"set", "add", "remove", "reset", "list", "enable", "test", "operation", "tag"});
            }

            if(!"set".equalsIgnoreCase(var3[1]) && !"add".equalsIgnoreCase(var3[1]) && !"remove".equalsIgnoreCase(var3[1]) && !"reset".equalsIgnoreCase(var3[1])) {
               if("enable".equalsIgnoreCase(var3[1])) {
                  if(var3.length == 3) {
                     return D(var3, var1.k());
                  }

                  if(var3.length == 4) {
                     return o(var3, this.H(var1));
                  }
               } else if(!"list".equalsIgnoreCase(var3[1]) && !"test".equalsIgnoreCase(var3[1])) {
                  if("operation".equalsIgnoreCase(var3[1])) {
                     if(var3.length == 3) {
                        return o(var3, this.y(var1).e());
                     }

                     if(var3.length == 4) {
                        return o(var3, this.Q(true, var1));
                     }

                     if(var3.length == 5) {
                        return D(var3, new String[]{"+=", "-=", "*=", "/=", "%=", "=", "<", ">", "><"});
                     }

                     if(var3.length == 6) {
                        return D(var3, var1.k());
                     }

                     if(var3.length == 7) {
                        return o(var3, this.Q(false, var1));
                     }
                  } else if("tag".equalsIgnoreCase(var3[1])) {
                     if(var3.length == 3) {
                        return o(var3, this.y(var1).e());
                     }

                     if(var3.length == 4) {
                        return D(var3, new String[]{"add", "remove", "list"});
                     }
                  }
               } else {
                  if(var3.length == 3) {
                     return o(var3, this.y(var1).e());
                  }

                  if(var3.length == 4 && "test".equalsIgnoreCase(var3[1])) {
                     return o(var3, this.Q(false, var1));
                  }
               }
            } else {
               if(var3.length == 3) {
                  return D(var3, var1.k());
               }

               if(var3.length == 4) {
                  return o(var3, this.Q(true, var1));
               }
            }
         } else if("teams".equalsIgnoreCase(var3[0])) {
            if(var3.length == 2) {
               return D(var3, new String[]{"add", "remove", "join", "leave", "empty", "list", "option"});
            }

            if("join".equalsIgnoreCase(var3[1])) {
               if(var3.length == 3) {
                  return o(var3, this.y(var1).P());
               }

               if(var3.length >= 4) {
                  return D(var3, var1.k());
               }
            } else {
               if("leave".equalsIgnoreCase(var3[1])) {
                  return D(var3, var1.k());
               }

               if(!"empty".equalsIgnoreCase(var3[1]) && !"list".equalsIgnoreCase(var3[1]) && !"remove".equalsIgnoreCase(var3[1])) {
                  if("option".equalsIgnoreCase(var3[1])) {
                     if(var3.length == 3) {
                        return o(var3, this.y(var1).P());
                     }

                     if(var3.length == 4) {
                        return D(var3, new String[]{"color", "friendlyfire", "seeFriendlyInvisibles", "nametagVisibility", "deathMessageVisibility", "collisionRule"});
                     }

                     if(var3.length == 5) {
                        if("color".equalsIgnoreCase(var3[3])) {
                           return o(var3, net.cb.z.s(true, false));
                        }

                        if("nametagVisibility".equalsIgnoreCase(var3[3]) || "deathMessageVisibility".equalsIgnoreCase(var3[3])) {
                           return D(var3, net.nc.m.z());
                        }

                        if("collisionRule".equalsIgnoreCase(var3[3])) {
                           return D(var3, net.nc.m.P());
                        }

                        if("friendlyfire".equalsIgnoreCase(var3[3]) || "seeFriendlyInvisibles".equalsIgnoreCase(var3[3])) {
                           return D(var3, new String[]{"true", "false"});
                        }
                     }
                  }
               } else if(var3.length == 3) {
                  return o(var3, this.y(var1).P());
               }
            }
         }

         return Collections.emptyList();
      }
   }

   protected List Q(boolean var1, net.nx.f var2) {
      Collection var3 = this.y(var2).q();
      ArrayList var4 = Lists.newArrayList();

      for(net.nc.l var6 : var3) {
         if(!var6.v().B()) {
            var4.add(var6.e());
         }
      }

      return var4;
   }

   protected List H(net.nx.f var1) {
      Collection var2 = this.y(var1).q();
      ArrayList var3 = Lists.newArrayList();

      for(net.nc.l var5 : var2) {
         if(var5.v() == net.nc.u.z) {
            var3.add(var5.e());
         }
      }

      return var3;
   }

   public boolean T(String[] var1, int var2) {
      return !"players".equalsIgnoreCase(var1[0])?("teams".equalsIgnoreCase(var1[0])?var2 == 2:false):(var1.length > 1 && "operation".equalsIgnoreCase(var1[1])?var2 == 2 || var2 == 5:var2 == 2);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
