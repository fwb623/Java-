# Java-
### 实验2
 #### 范文博 2020322103 G计202
## 1.实验内容：
- 1,用类描述计算机中的cpu模型，速度和硬盘的容量.
- 2,要求java应用程序又4个类，名字分别为PC，CPU，HardDis，Test，把测试设为主类，掌握构造方法，实现定义属性的修饰符近似。
- 3类中定义不少于两个构造方法；每个类定义不少于2个属性.
- 4属性的类型应该多样化尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
---
## 2.实验方法：
- main方法中创造一个cpu对象，cpu =cpu,cpu中的速度设置为2200，再加入一个构造方法id，把id设为骁龙980.
---
                         public void CPU {private int speed;
                         private string  id;
                         int getSpeed（）{return speed；} 
                         public void setSpeed（int speed）{this.speed = speed; }
                         string getid () {return id;} 
                         public void setid(string id) {this.id = id}   
                              
- main方法中创造一个HardDisk对象，HD =HD,HD中的amount设置为200，再加入一个构造方法type，把type设为机械硬盘.
---
                         public void HardDisk {private int amount;
                         private string type; 
                         int getamount（）{return amount; } 
                         public void setamount（int amount）{this.m = m; }
                         string gettype（）{return type; } 
                         public void settype(string type）{this.type = type; }
                                       
## 3.核心方法：
                         public void PC {CPU cpu; HardDisk HD；void setCPU（CPU cpu）{this.cpu = cpu; } 
                         void setHardDisk（HardDisk HD）{this.HD = HD; } 
                         void show（）{
                         System.out.println（“ cpu速度：” + cpu.getSpeed（））; 
                         System.out.println（“ cpu名字：” + cpu.getid（））; 
                         System.out.println（“硬盘容量：” + HD.getAmount（））;
                         System.out.println（“硬盘类型：” + HD.gettype（））;}
---
                         public void Test{CPU cpu = new CPU（）; ##硬盘HD =新的HardDisk（）;
                         cpu.setSpeed（2200）; HD.setAmount（200）; 
                         cpu.setid（骁龙980）; HD.settype（机械硬盘）; 
                         PC pc =新PC（）;
                         pc.setCPU（cpu）; pc.setHardDisk（HD）; 
                         pc.show（）;}
## 5.实验结果
cpu速度：2200硬盘容量：200 cpu名字：骁龙980 硬盘类型：机械硬盘 
## 6.实验感想
了解如何定义对象调用对象，对构造方法有一定的了解，属性的类型多样化，也清楚的了解到**缺省，private，protected，public可以访问的控制类型。** 
