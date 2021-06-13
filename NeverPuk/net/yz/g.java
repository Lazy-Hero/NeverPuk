package net.yz;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.xn;
import net.yz.m_;

public class g extends AbstractSet {
   private static final Set i = Sets.newHashSet();
   private final Map I = Maps.newHashMap();
   private final Set F;
   private final Class H;
   private final List l;

   public g(Class var1) {
      m_.g();
      this.F = Sets.newIdentityHashSet();
      this.l = Lists.newArrayList();
      this.H = var1;
      this.F.add(var1);
      this.I.put(var1, this.l);
      Iterator var3 = i.iterator();
      if(var3.hasNext()) {
         Class var4 = (Class)var3.next();
         this.Z(var4);
      }

   }

   protected void Z(Class var1) {
      i.add(var1);

      for(Object var3 : this.l) {
         if(var1.isAssignableFrom(var3.getClass())) {
            this.c(var3, var1);
         }
      }

      this.F.add(var1);
   }

   protected Class s(Class var1) {
      if(this.H.isAssignableFrom(var1)) {
         if(!this.F.contains(var1)) {
            this.Z(var1);
         }

         return var1;
      } else {
         throw new IllegalArgumentException("Don\'t know how to search for " + var1);
      }
   }

   public boolean add(Object var1) {
      for(Class var3 : this.F) {
         if(var3.isAssignableFrom(var1.getClass())) {
            this.c(var1, var3);
         }
      }

      return true;
   }

   private void c(Object var1, Class var2) {
      List var3 = (List)this.I.get(var2);
      this.I.put(var2, Lists.newArrayList(new Object[]{var1}));
   }

   public boolean remove(Object var1) {
      int var2 = m_.J();
      boolean var4 = false;
      Iterator var5 = this.F.iterator();
      if(var5.hasNext()) {
         Class var6 = (Class)var5.next();
         if(var6.isAssignableFrom(var1.getClass())) {
            List var7 = (List)this.I.get(var6);
            if(var7 != null && var7.remove(var1)) {
               var4 = true;
            }
         }
      }

      return var4;
   }

   public boolean contains(Object var1) {
      return Iterators.contains(this.m(var1.getClass()).iterator(), var1);
   }

   public Iterable m(final Class var1) {
      return new Iterable() {
         public Iterator iterator() {
            m_.J();
            List var2 = (List)g.this.I.get(g.this.s(var1));
            if(var2 == null) {
               return Collections.emptyIterator();
            } else {
               Iterator var3 = var2.iterator();
               return Iterators.filter(var3, var1);
            }
         }

         private static xn a(xn var0) {
            return var0;
         }
      };
   }

   public Iterator iterator() {
      return (Iterator)(this.l.isEmpty()?Collections.emptyIterator():Iterators.unmodifiableIterator(this.l.iterator()));
   }

   public int size() {
      return this.l.size();
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
