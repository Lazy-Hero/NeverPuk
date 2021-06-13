package net;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import net.d1;
import net.di;
import net.dv;
import net.in;
import net.m5;
import net.m_;
import net.md;
import net.mk;
import net.ml;
import net.mo;
import net.mp;
import net.mx;
import net.mz;
import net.or;
import net.s0;
import net.s1;
import net.s2;
import net.s3;
import net.s4;
import net.s5;
import net.s6;
import net.s7;
import net.s8;
import net.s9;
import net.s_;
import net.sa;
import net.sb;
import net.sc;
import net.sd;
import net.se;
import net.sf;
import net.sg;
import net.sh;
import net.si;
import net.sj;
import net.sk;
import net.sl;
import net.sm;
import net.sn;
import net.so;
import net.sp;
import net.sq;
import net.sr;
import net.ss;
import net.st;
import net.su;
import net.sv;
import net.sw;
import net.sx;
import net.sy;
import net.sz;
import net.v0;
import net.v1;
import net.v2;
import net.v3;
import net.v4;
import net.v5;
import net.v6;
import net.v7;
import net.v8;
import net.v9;
import net.v_;
import net.va;
import net.vb;
import net.vc;
import net.vd;
import net.ve;
import net.vf;
import net.vg;
import net.vh;
import net.vi;
import net.vj;
import net.vk;
import net.vl;
import net.vm;
import net.vn;
import net.vo;
import net.vp;
import net.vq;
import net.vr;
import net.vs;
import net.vt;
import net.vu;
import net.vv;
import net.vw;
import net.vx;
import net.vy;
import net.vz;
import net.xn;
import net.nn.j;
import net.u.d;

public class _3 implements in {
   public ArrayList F = new ArrayList();

   public _3() {
      this.F.add(new v1());
      this.F.add(new dv());
      this.F.add(new so());
      this.F.add(new ve());
      this.F.add(new mx());
      this.F.add(new s4());
      this.F.add(new s2());
      or.o();
      this.F.add(new md());
      this.F.add(new mp());
      this.F.add(new sq());
      this.F.add(new si());
      this.F.add(new ml());
      this.F.add(new vv());
      this.F.add(new mo());
      this.F.add(new m5());
      this.F.add(new m_());
      this.F.add(new s7());
      this.F.add(new vi());
      this.F.add(new s9());
      this.F.add(new sz());
      this.F.add(new mz());
      this.F.add(new sv());
      this.F.add(new s5());
      this.F.add(new sc());
      this.F.add(new sn());
      this.F.add(new sm());
      this.F.add(new ss());
      this.F.add(new vg());
      this.F.add(new sw());
      this.F.add(new s6());
      this.F.add(new s8());
      this.F.add(new s3());
      this.F.add(new sj());
      this.F.add(new vl());
      this.F.add(new v4());
      this.F.add(new v7());
      this.F.add(new sk());
      this.F.add(new sy());
      this.F.add(new s1());
      this.F.add(new sd());
      this.F.add(new sp());
      this.F.add(new s0());
      this.F.add(new sx());
      this.F.add(new v2());
      this.F.add(new vp());
      this.F.add(new vx());
      this.F.add(new vu());
      this.F.add(new st());
      this.F.add(new vs());
      this.F.add(new v_());
      this.F.add(new v5());
      this.F.add(new vk());
      this.F.add(new sl());
      this.F.add(new v0());
      this.F.add(new sa());
      this.F.add(new d1());
      this.F.add(new se());
      this.F.add(new v3());
      this.F.add(new v6());
      this.F.add(new vr());
      this.F.add(new vy());
      this.F.add(new vj());
      this.F.add(new vt());
      this.F.add(new vc());
      this.F.add(new va());
      this.F.add(new v8());
      this.F.add(new sh());
      this.F.add(new vn());
      this.F.add(new di());
      this.F.add(new vd());
      this.F.add(new vz());
      this.F.add(new s_());
      this.F.add(new vq());
      this.F.add(new vf());
      this.F.add(new vm());
      this.F.add(new v9());
      this.F.add(new vh());
      this.F.add(new vw());
      this.F.add(new vb());
      this.F.add(new su());
      this.F.add(new sg());
      this.F.add(new sf());
      this.F.add(new vo());
      this.F.add(new sb());
      this.F.add(new sr());
      this.F.sort(Comparator.comparingInt((var0) -> {
         return -j.b().s3.s(var0.i());
      }));
      d.h(new d[5]);
   }

   public ArrayList X() {
      return this.F;
   }

   public List M(or var1) {
      or.o();
      ArrayList var3 = new ArrayList();
      Iterator var4 = this.X().iterator();
      if(var4.hasNext()) {
         mk var5 = (mk)var4.next();
         if(var5.b() == var1) {
            var3.add(var5);
         }
      }

      if(d.y() == null) {
         or.J(new String[1]);
      }

      return var3;
   }

   public mk p(String var1) {
      or.o();
      Iterator var3 = this.X().iterator();
      if(var3.hasNext()) {
         mk var4 = (mk)var3.next();
         if(var4.i().equalsIgnoreCase(var1)) {
            return var4;
         }
      }

      return null;
   }

   public mk d(Class var1) {
      for(mk var3 : this.X()) {
         if(var3.getClass() == var1) {
            return var3;
         }
      }

      return null;
   }

   public List c() {
      return (List)this.X().stream().filter(mk::v).collect(Collectors.toCollection(ArrayList::<init>));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
