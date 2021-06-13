package net;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.pi;
import net.z_;
import net.zn;
import net.z.m;
import org.apache.commons.lang3.RandomStringUtils;

public class di extends mk {
   public ArrayList w = new ArrayList();
   int T;
   int d;
   mc F;

   public di() {
      super("Spammer", or.World);
      ArrayList var1 = new ArrayList();
      gn.Q.J.d(new mc("Spammer Mode", this, "Default", var1));
      var1.add("Default");
      var1.add("Absurd");
      var1.add("HvH?");
      var1.add("Custom");
      gn.Q.J.d(this.F = new mc("Message Delay", this, 100.0D, 10.0D, 500.0D, 10.0D));
   }

   @mr
   public void Z(zn var1) throws IOException {
      m.a();
      String var3 = gn.Q.J.S("Spammer Mode").M();
      if(var3.equalsIgnoreCase("Default")) {
         String var4 = RandomStringUtils.randomAlphabetic(3);
         String var5 = RandomStringUtils.randomPrint(5);
         String var6 = RandomStringUtils.randomPrint(1);
         String var7 = "";
         double var8 = (double)this.F.e();
         this.t("" + (int)var8);
         if(this.T++ % (int)var8 == 0) {
            switch(this.d) {
            case 0:
               p.sf.f("![" + var4 + "] Free N" + var7 + "everHook better than R" + var7 + "ageR10 `vk.com/neverhook ` [" + var5 + "]");
               ++this.d;
            case 1:
               p.sf.f("![" + var4 + "] Free N" + var7 + "everHook better than S" + var7 + "tressClient `vk.com/neverhook ` [" + var5 + "]");
               ++this.d;
            case 2:
               p.sf.f("![" + var4 + "] Free N" + var7 + "everHook better than S" + var7 + "igma `vk.com/neverhook ` [" + var5 + "]");
               ++this.d;
            case 3:
               p.sf.f("![" + var4 + "] Free N" + var7 + "everHook better than C" + var7 + "lown `vk.com/neverhook ` [" + var5 + "]");
               ++this.d;
            case 4:
               p.sf.f("![" + var4 + "] Free N" + var7 + "everHook better than A" + var7 + "krien `vk.com/neverhook ` [" + var5 + "]");
               this.d = 0;
            }
         }
      } else {
         if(var3.equalsIgnoreCase("Absurd")) {
            String var10 = RandomStringUtils.randomAlphabetic(3);
            String var13 = RandomStringUtils.randomPrint(5);
            String var16 = "";
            double var19 = (double)this.F.e();
            this.t("" + (int)var19);
            if(this.T++ % (int)var19 == 0) {
               switch(this.d) {
               case 0:
                  p.sf.f(var16 + "!Diluted with a fair amount of empathy, rational thinking unambiguously defines each participant as capable of making their own decisions regarding the forms of influence. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 1:
                  p.sf.f(var16 + "!In general, of course, synthetic testing provides ample opportunities for clustering efforts. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 2:
                  p.sf.f(var16 + "!In our efforts to improve the user experience, we miss that basic user behavior scenarios are equally left to their own devices. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 3:
                  p.sf.f(var16 + "!Your actions are meaningless, your words are absurd. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 4:
                  p.sf.f(var16 + "!You have to work not for 12 hours, but with your head. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 5:
                  p.sf.f(var16 + "!Taking into account the key scenarios of behavior, the beginning of the daily work on the formation of a position ensures the relevance of experiments that are striking in their scale and grandeur. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 6:
                  p.sf.f(var16 + "!Break break break, we\'ll buy a new one. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 7:
                  p.sf.f(var16 + "!Oh no! It seems... I won. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 8:
                  p.sf.f(var16 + "!Come on! Press Alt + F4, get out of this f$cking hell. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 9:
                  p.sf.f(var16 + "!As part of the specification of modern standards, the key features of the project structure are verified in a timely manner. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 10:
                  p.sf.f(var16 + "!And again I got caught... [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 11:
                  p.sf.f(var16 + "!Every day is the same, how long will it last? [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 12:
                  p.sf.f(var16 + "!Here is a vivid example of modern trends - a high-quality prototype of a future project for the preparation and implementation of clustering efforts. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 13:
                  p.sf.f(var16 + "!In their quest to improve the quality of life, they forget that the economic agenda of today allows them to complete important tasks to develop the timely implementation of the super task. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 14:
                  p.sf.f(var16 + "!Some features of domestic policy, overcoming the current difficult economic situation, are equally left to their own devices. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 15:
                  p.sf.f(var16 + "!The importance of these problems is so obvious that the solidarity of a team of professionals allows us to complete important tasks of developing deep reasoning. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 16:
                  p.sf.f(var16 + "!By the way, entrepreneurs on the Internet are limited solely by the way of thinking. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 17:
                  p.sf.f(var16 + "!The task of the organization, in particular the new model of organizational activity, is a qualitatively new stage of the corresponding conditions of activation. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 18:
                  p.sf.f(var16 + "!Taking into account the current international situation, diluted with a fair amount of empathy, rational thinking allows you to perform important tasks in the development of innovative methods of process management. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 19:
                  p.sf.f(var16 + "!By the way, the elements of the political process only add to factional differences and are made public. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 20:
                  p.sf.f(var16 + "!In general, of course, the strengthening and development of the internal structure ensures the relevance of the phased and consistent development of society. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 21:
                  p.sf.f(var16 + "!Diverse and rich experience tells us that the further development of various forms of activity provides ample opportunities for rethinking foreign economic policies. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 22:
                  p.sf.f(var16 + "!And also conclusions made on the basis of Internet analytics can be associatively distributed by industry. [" + var10 + "] [" + var13 + "]");
                  ++this.d;
               case 23:
                  p.sf.f(var16 + "!Taking into account the indicators of success, the strengthening and development of the internal structure creates the preconditions for a system of mass participation. [" + var10 + "] [" + var13 + "]");
                  this.d = 0;
               }
            }
         }

         if(var3.equalsIgnoreCase("HvH?")) {
            String var11 = RandomStringUtils.randomAlphabetic(3);
            String var14 = RandomStringUtils.randomPrint(5);
            String var17 = "";
            double var20 = (double)this.F.e();
            this.t("" + (int)var20);
            if(this.T++ % (int)var20 == 0) {
               switch(this.d) {
               case 0:
                  p.sf.f(var17 + "!Твой клиент зaлупa ебaная)) Кид@й мнe дyэль: \"/duel " + p.sf.Q() + "\".  Карта: Пляж  [" + var11 + "] [" + var14 + "]");
                  ++this.d;
               case 1:
                  p.sf.f(var17 + "!Правда думаешь твой клиент лучше?) Кидaй мне дуэль: \"/duel " + p.sf.Q() + "\". Карта: Пляж  [" + var11 + "] [" + var14 + "]");
                  ++this.d;
               case 2:
                  p.sf.f(var17 + "!Ты как себя ведешь бл9дина eбaнaя? Кiдай мне дуэль: \"/duel " + p.sf.Q() + "\".  Карта: Пляж  [" + var11 + "] [" + var14 + "]");
                  this.d = 0;
               }
            }
         }

         if(var3.equalsIgnoreCase("Custom")) {
            String var12 = RandomStringUtils.randomAlphabetic(3);
            String var15 = RandomStringUtils.randomPrint(5);
            File var18 = new File(p.sn + "\\NeverHook", "Spammer.txt");
            if(!var18.exists()) {
               var18.createNewFile();
            }

            Scanner var21 = new Scanner(var18);
            if(var21.nextLine() == null) {
               pi.d("Module", "В " + this.i() + " нету текста!", 6, z_.ERROR);
            }

            double var22 = (double)this.F.e();

            label2831:
            while(var21.hasNextLine()) {
               if(this.T++ % (int)var22 == 0) {
                  switch(this.d) {
                  case 0:
                     p.sf.f("! \'" + var21.nextLine() + "\' " + var15 + var12 + "\\");
                  case 1:
                     p.sf.f("! \'" + var21.nextLine() + "\' " + var15 + var12);
                  default:
                     break label2831;
                  }
               }
            }

            var21.close();
         }
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
