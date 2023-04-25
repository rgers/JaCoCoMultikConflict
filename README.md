# JaCoCoMultikConflict

Try testing with:
```./gradlew :app:testDevDebugUnitTest  --info```

It will fail with:
```
pl.gers.jacocomultikconflict.ExampleUnitTest > multikest FAILED
    java.lang.VerifyError: Inconsistent stackmap frames at branch target 221
    Exception Details:
      Location:
        org/jetbrains/kotlinx/multik/api/CreateNDArrayKt.linspace$default(Lorg/jetbrains/kotlinx/multik/api/Multik;DDIILjava/lang/Object;)Lorg/jetbrains/kotlinx/multik/ndarray/data/NDArray; @221: iload
      Reason:
        Type top (current frame, locals[9]) is not assignable to double (stack map, locals[9])
      Current Frame:
        bci: @144
        flags: { }
        locals: { 'org/jetbrains/kotlinx/multik/api/Multik', double, double_2nd, double, double_2nd, integer, integer, double, double_2nd, top, double, double_2nd, top, 'org/jetbrains/kotlinx/multik/api/Multik', integer, integer, integer, 'org/jetbrains/kotlinx/multik/api/Multik', double, double_2nd, integer }
        stack: { integer, integer }
      Stackmap Frame:
        bci: @221
        flags: { }
        locals: { 'org/jetbrains/kotlinx/multik/api/Multik', double, double_2nd, double, double_2nd, integer, integer, double, double_2nd, double, double_2nd, top, 'org/jetbrains/kotlinx/multik/api/Multik', integer, integer, integer, 'org/jetbrains/kotlinx/multik/api/Multik', double, double_2nd, integer }
        stack: { }
      Bytecode:
        0000000: b804 963a 0815 0607 7e9a 000d 1908 1106
        0000010: d804 54a7 000e 1032 3605 1908 1106 d904
        0000020: 542a 1211 b800 1703 3606 1505 9e00 0e04
        0000030: 1908 1106 da04 54a7 000b 0319 0811 06db
        0000040: 0454 9a00 2603 3609 1303 d019 0811 06dc
        0000050: 0454 3a09 bb00 6459 1909 b600 65b7 0068
        0000060: 1908 1106 dd04 54bf 1505 870f 6739 0729
        0000070: 2767 390a 2a3a 0d03 360e 0436 0f03 3610
        0000080: 190d 3a11 150f 8739 1203 3614 150e 1505
        0000090: a200 4d18 120e 979e 000e 0419 0811 06de
        00000a0: 0454 a700 0b03 1908 1106 df04 5499 000d
        00000b0: 1908 1106 e004 54a7 0081 0336 1513 0387
        00000c0: 1908 1106 e104 543a 15bb 0064 5919 15b6
        00000d0: 0065 b700 6819 0811 06e2 0454 bf15 0e15
        00000e0: 05a3 000d 1908 1106 e304 54a7 004d 1812
        00000f0: 0e98 9c00 0e04 1908 1106 e404 54a7 000b
        0000100: 0319 0811 06e5 0454 9900 0d19 0811 06e6
        0000110: 0454 a700 2603 3615 1303 8919 0811 06e7
        0000120: 0454 3a15 bb00 6459 1915 b600 65b7 0068
        0000130: 1908 1106 e804 54bf 1505 8715 0e87 6718
        0000140: 126f b803 8f8e 3616 1908 1106 e904 54b2
        0000150: 006d 3a17 1293 b800 273a 1803 3619 1918
        0000160: 3a1a 1908 1106 ea04 5419 1ab2 0075 b800
        0000170: 27b8 002d 9900 10b2 0079 1908 1106 eb04
        0000180: 54a7 00e6 191a b200 7cb8 0027 b800 2d99
        0000190: 0010 b200 7f19 0811 06ec 0454 a700 cb19
        00001a0: 1ab2 0082 b800 27b8 002d 9900 10b2 0085
        00001b0: 1908 1106 ed04 54a7 00b0 191a b200 88b8
        00001c0: 0027 b800 2d99 0010 b200 8b19 0811 06ee
        00001d0: 0454 a700 9519 1ab2 008e b800 27b8 002d
        00001e0: 9900 10b2 0091 1908 1106 ef04 54a7 007a
        00001f0: 191a b200 94b8 0027 b800 2d99 0010 b200
        0000200: 9719 0811 06f0 0454 a700 5f19 1a12 99b8
        0000210: 0027 b800 2d99 0010 b200 9c19 0811 06f1
        0000220: 0454 a700 4519 1a12 9eb8 0027 b800 2d99
        0000230: 0010 b200 a119 0811 06f2 0454 a700 2bbb
        0000240: 00a3 59bb 004e 59b7 0051 12a5 b600 5719
        0000250: 18b9 00aa 0100 b600 57b6 0062 b700 ab19
        0000260: 0811 06f3 0454 bf00 3a15 04bc 0a3a 1819
        0000270: 1803 1516 4f19 183a 1719 0811 06f4 0454
        0000280: 1516 1915 b800 ce3a 1919 19c0 021b 3a1a
        0000290: 0336 1b15 0e87 391c 1908 1106 f504 5419
        00002a0: 1ab6 0395 3a1e 191e b603 9836 1f19 1eb6
        00002b0: 039b 3620 151f 1520 a400 0d19 0811 06f6
        00002c0: 0454 a701 2019 0811 06f7 0454 191a 151f
        00002d0: 181c 3921 0336 2312 93b8 0027 3a24 1908
        00002e0: 1106 f804 5419 24b2 0075 b800 27b8 002d
        00002f0: 9900 1418 218e 91b8 012f 1908 1106 f904
        0000300: 54a7 00ab 1924 b200 7cb8 0027 b800 2d99
        0000310: 0014 1821 8e93 b801 3219 0811 06fa 0454
        0000320: a700 8c19 24b2 0082 b800 27b8 002d 9900
        0000330: 1318 218e b801 3519 0811 06fb 0454 a700
        0000340: 6e19 24b2 0088 b800 27b8 002d 9900 1318
        0000350: 218f b801 3819 0811 06fc 0454 a700 5019
        0000360: 24b2 008e b800 27b8 002d 9900 1318 2190
        0000370: b801 3b19 0811 06fd 0454 a700 3219 24b2
        0000380: 0094 b800 27b8 002d 9900 1218 21b8 013e
        0000390: 1908 1106 fe04 54a7 0015 bb03 9d59 1303
        00003a0: 9fb7 03a0 1908 1106 ff04 54bf c000 93c0
        00003b0: 0391 0019 0811 0700 0454 b602 1f18 1c18
        00003c0: 1263 391c 151f 1520 a000 0d19 0811 0701
        00003d0: 0454 a700 1084 1f01 1908 1107 0204 54a7
        00003e0: feed 0019 19c0 021b 3a18 1908 1107 0304
        00003f0: 54bb 00d0 5919 18c0 00d2 0319 1701 b200
        0000400: 31c0 0021 0110 2a01 b700 d500 3a0c 1505
        0000410: 04a3 000d 1908 1107 0404 54a7 0025 180a
        0000420: 1807 6f39 0d19 0811 0705 0454 190c c001
        0000430: 6a18 0db8 013e b803 d619 0811 0706 0454
        0000440: 190c c001 6a27 b801 3eb8 03d9 1908 1107
        0000450: 0704 5419 0cc0 016a 190c b603 da04 6429
        0000460: b801 3eb8 03de 190c 3a0d 0336 0e19 0811
        0000470: 0708 0454 b200 6d3a 0f07 126f b800 1f13
        0000480: 0391 b800 273a 1003 3611 1910 3a12 1908
        0000490: 1107 0904 5419 12b2 0075 b800 27b8 002d
        00004a0: 9900 10b2 0079 1908 1107 0a04 54a7 00e6
        00004b0: 1912 b200 7cb8 0027 b800 2d99 0010 b200
        00004c0: 7f19 0811 070b 0454 a700 cb19 12b2 0082
        00004d0: b800 27b8 002d 9900 10b2 0085 1908 1107
        00004e0: 0c04 54a7 00b0 1912 b200 88b8 0027 b800
        00004f0: 2d99 0010 b200 8b19 0811 070d 0454 a700
        0000500: 9519 12b2 008e b800 27b8 002d 9900 10b2
        0000510: 0091 1908 1107 0e04 54a7 007a 1912 b200
        0000520: 94b8 0027 b800 2d99 0010 b200 9719 0811
        0000530: 070f 0454 a700 5f19 1212 99b8 0027 b800
        0000540: 2d99 0010 b200 9c19 0811 0710 0454 a700
        0000550: 4519 1212 9eb8 0027 b800 2d99 0010 b200
        0000560: a119 0811 0711 0454 a700 2bbb 00a3 59bb
        0000570: 004e 59b7 0051 12a5 b600 5719 10b9 00aa
        0000580: 0100 b600 57b6 0062 b700 ab19 0811 0712
        0000590: 0454 bf00 3a13 1908 1107 1304 5419 0d19
        00005a0: 13b6 03e2 1908 1107 1404 54b0          
      Stackmap Table:
        append_frame(@22,Object[#1176])
        same_frame(@33)
        same_frame(@58)
        same_locals_1_stack_item_frame(@66,Integer)
        same_frame(@104)
        full_frame(@165,{Object[#242],Double,Double,Integer,Integer,Double,Double,Top,Object[#242],Integer,Integer,Integer,Object[#242],Double,Integer},{})
        same_locals_1_stack_item_frame(@173,Integer)
        same_frame(@186)
        same_frame(@221)
        same_frame(@238)
        same_frame(@256)
        same_locals_1_stack_item_frame(@264,Integer)
        same_frame(@277)
        same_frame(@312)
        full_frame(@388,{Object[#242],Double,Double,Integer,Integer,Double,Double,Top,Object[#242],Integer,Integer,Integer,Object[#242],Double,Integer,Top,Integer,Object[#245],Object[#167],Integer,Object[#167]},{})
        same_frame(@415)
        same_frame(@442)
        same_frame(@469)
        same_frame(@496)
        same_frame(@523)
        same_frame(@549)
        same_frame(@575)
        same_locals_1_stack_item_frame(@615,Object[#106])
        full_frame(@709,{Object[#242],Double,Double,Integer,Integer,Double,Double,Top,Object[#242],Integer,Integer,Integer,Object[#242],Double,Integer,Object[#106],Integer,Object[#243],Object[#243],Object[#539],Object[#539],Integer,Double,Object[#178],Integer,Integer},{})
        same_frame(@716)
        full_frame(@772,{Object[#242],Double,Double,Integer,Integer,Double,Double,Top,Object[#242],Integer,Integer,Integer,Object[#242],Double,Integer,Object[#106],Integer,Object[#243],Object[#243],Object[#539],Object[#539],Integer,Double,Object[#178],Integer,Integer,Double,Integer,Object[#167]},{Object[#539],Integer})
        full_frame(@803,{Object[#242],Double,Double,Integer,Integer,Double,Double,Top,Object[#242],Integer,Integer,Integer,Object[#242],Double,Integer,Object[#106],Integer,Object[#243],Object[#243],Object[#539],Object[#539],Integer,Double,Object[#178],Integer,Integer,Double,Integer,Object[#167]},{Object[#539],Integer})
        full_frame(@833,{Object[#242],Double,Double,Integer,Integer,Double,Double,Top,Object[#242],Integer,Integer,Integer,Object[#242],Double,Integer,Object[#106],Integer,Object[#243],Object[#243],Object[#539],Object[#539],Integer,Double,Object[#178],Integer,Integer,Double,Integer,Object[#167]},{Object[#539],Integer})
        full_frame(@863,{Object[#242],Double,Double,Integer,Integer,Double,Double,Top,Object[#242],Integer,Integer,Integer,Object[#242],Double,Integer,Object[#106],Integer,Object[#243],Object[#243],Object[#539],Object[#539],Integer,Double,Object[#178],Integer,Integer,Double,Integer,Object[#167]},{Object[#539],Integer})
        full_frame(@893,{Object[#242],Double,Double,Integer,Integer,Double,Double,Top,Object[#242],Integer,Integer,Integer,Object[#242],Double,Integer,Object[#106],Integer,Object[#243],Object[#243],Object[#539],Object[#539],Integer,Double,Object[#178],Integer,Integer,Double,Integer,Object[#167]},{Object[#539],Integer})
        full_frame(@922,{Object[#242],Double,Double,Integer,Integer,Double,Double,Top,Object[#242],Integer,Integer,Integer,Object[#242],Double,Integer,Object[#106],Integer,Object[#243],Object[#243],Object[#539],Object[#539],Integer,Double,Object[#178],Integer,Integer,Double,Integer,Object[#167]},{Object[#539],Integer})
        full_frame(@940,{Object[#242],Double,Double,Integer,Integer,Double,Double,Top,Object[#242],Integer,Integer,Integer,Object[#242],Double,Integer,Object[#106],Integer,Object[#243],Object[#243],Object[#539],Object[#539],Integer,Double,Object[#178],Integer,Integer,Double,Integer,Object[#167]},{Object[#539],Integer,Object[#4]})
        same_frame(@981)
        chop_frame(@994,3)
        full_frame(@1054,{Object[#242],Double,Double,Integer,Integer,Double,Double,Object[#208],Object[#242],Integer,Integer,Integer,Object[#242],Double,Integer,Object[#106],Integer,Object[#243],Object[#539],Object[#539],Object[#539],Integer,Double,Object[#178],Integer,Integer},{})
        full_frame(@1088,{Object[#242],Double,Double,Integer,Integer,Double,Double,Object[#208],Top,Top,Integer,Integer,Object[#242],Double,Integer,Object[#106],Integer,Object[#243],Object[#539],Object[#539],Object[#539],Integer,Double,Object[#178],Integer,Integer},{})
        full_frame(@1200,{Object[#242],Double,Double,Integer,Integer,Double,Double,Object[#208],Object[#208],Integer,Object[#245],Object[#167],Integer,Object[#167],Top,Integer,Object[#106],Integer,Object[#243],Object[#539],Object[#539],Object[#539],Integer,Double,Object[#178],Integer,Integer},{})
        same_frame(@1227)
        same_frame(@1254)
        same_frame(@1281)
        same_frame(@1308)
        same_frame(@1335)
        same_frame(@1361)
        same_frame(@1387)
        same_locals_1_stack_item_frame(@1427,Object[#106])
        at pl.gers.jacocomultikconflict.ExampleUnitTest.multikest(ExampleUnitTest.kt:15)
```
