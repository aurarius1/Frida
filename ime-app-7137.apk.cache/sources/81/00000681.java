package p093c.p097b.p122u;

import com.anysoftkeyboard.dictionaries.GetWordsCallback;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: c.b.u.z */
/* loaded from: classes.dex */
public abstract class AbstractC1533z {

    /* renamed from: a */
    public static final char[] f4905a = {0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, ' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, ' ', 161, 162, 163, 164, 165, 166, 167, ' ', 169, 'a', 171, 172, 173, 174, ' ', 176, 177, '2', '3', ' ', 956, 182, 183, ' ', '1', 'o', 187, '1', '1', '3', 191, 'A', 'A', 'A', 'A', 'A', 'A', 198, 'C', 'E', 'E', 'E', 'E', 'I', 'I', 'I', 'I', 208, 'N', 'O', 'O', 'O', 'O', 'O', 215, 'O', 'U', 'U', 'U', 'U', 'Y', 222, 's', 'a', 'a', 'a', 'a', 'a', 'a', 230, 'c', 'e', 'e', 'e', 'e', 'i', 'i', 'i', 'i', 240, 'n', 'o', 'o', 'o', 'o', 'o', 247, 'o', 'u', 'u', 'u', 'u', 'y', 254, 'y', 'A', 'a', 'A', 'a', 'A', 'a', 'C', 'c', 'C', 'c', 'C', 'c', 'C', 'c', 'D', 'd', 272, 273, 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'G', 'g', 'G', 'g', 'G', 'g', 'G', 'g', 'H', 'h', 294, 295, 'I', 'i', 'I', 'i', 'I', 'i', 'I', 'i', 'I', 305, 'I', 'i', 'J', 'j', 'K', 'k', 312, 'L', 'l', 'L', 'l', 'L', 'l', 'L', 'l', 321, 322, 'N', 'n', 'N', 'n', 'N', 'n', 700, 330, 331, 'O', 'o', 'O', 'o', 'O', 'o', 338, 339, 'R', 'r', 'R', 'r', 'R', 'r', 'S', 's', 'S', 's', 'S', 's', 'S', 's', 'T', 't', 'T', 't', 358, 359, 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'W', 'w', 'Y', 'y', 'Y', 'Z', 'z', 'Z', 'z', 'Z', 'z', 's', 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 'O', 'o', 418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 'U', 'u', 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 'D', 'D', 'd', 'L', 'L', 'l', 'N', 'N', 'n', 'A', 'a', 'I', 'i', 'O', 'o', 'U', 'u', 220, 252, 220, 252, 220, 252, 220, 252, 477, 196, 228, 550, 551, 198, 230, 484, 485, 'G', 'g', 'K', 'k', 'O', 'o', 490, 491, 439, 658, 'j', 'D', 'D', 'd', 'G', 'g', 502, 503, 'N', 'n', 197, 229, 198, 230, 216, 248, 'A', 'a', 'A', 'a', 'E', 'e', 'E', 'e', 'I', 'i', 'I', 'i', 'O', 'o', 'O', 'o', 'R', 'r', 'R', 'r', 'U', 'u', 'U', 'u', 'S', 's', 'T', 't', 540, 541, 'H', 'h', 544, 545, 546, 547, 548, 549, 'A', 'a', 'E', 'e', 214, 246, 213, 245, 'O', 'o', 558, 559, 'Y', 'y', 564, 565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584, 585, 586, 587, 588, 589, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606, 607, 608, 609, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 625, 626, 627, 628, 629, 630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659, 660, 661, 662, 663, 664, 665, 666, 667, 668, 669, 670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 686, 687, 'h', 614, 'j', 'r', 633, 635, 641, 'w', 'y', 697, 698, 699, 700, 701, 702, 703, 704, 705, 706, 707, 708, 709, 710, 711, 712, 713, 714, 715, 716, 717, 718, 719, 720, 721, 722, 723, 724, 725, 726, 727, ' ', ' ', ' ', ' ', ' ', ' ', 734, 735, 611, 'l', 's', 'x', 661, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751, 752, 753, 754, 755, 756, 757, 758, 759, 760, 761, 762, 763, 764, 765, 766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827, 828, 829, 830, 831, 768, 769, 834, 787, 776, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 851, 852, 853, 854, 855, 856, 857, 858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870, 871, 872, 873, 874, 875, 876, 877, 878, 879, 880, 881, 882, 883, 697, 885, 886, 887, 888, 889, ' ', 891, 892, 893, ';', 895, 896, 897, 898, 899, ' ', 168, 913, 183, 917, 919, 921, 907, 927, 909, 933, 937, 970, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 921, 933, 945, 949, 951, 953, 971, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 953, 965, 959, 965, 969, 975, 946, 952, 933, 978, 978, 966, 960, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999, 
    1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 954, 961, 962, 1011, 920, 949, 1014, 1015, 1016, 931, 1018, 1019, 1020, 1021, 1022, 1023, 1045, 1045, 1026, 1043, 1028, 1029, 1030, 1030, 1032, 1033, 1034, 1035, 1050, 1048, 1059, 1039, 1040, 1041, 1042, 1043, 1044, 1045, 1046, 1047, 1048, 1048, 1050, 1051, 1052, 1053, 1054, 1055, 1056, 1057, 1058, 1059, 1060, 1061, 1062, 1063, 1064, 1065, 1066, 1067, 1068, 1069, 1070, 1071, 1072, 1073, 1074, 1075, 1076, 1077, 1078, 1079, 1080, 1080, 1082, 1083, 1084, 1085, 1086, 1087, 1088, 1089, 1090, 1091, 1092, 1093, 1094, 1095, 1096, 1097, 1098, 1099, 1100, 1101, 1102, 1103, 1077, 1077, 1106, 1075, 1108, 1109, 1110, 1110, 1112, 1113, 1114, 1115, 1082, 1080, 1091, 1119, 1120, 1121, 1122, 1123, 1124, 1125, 1126, 1127, 1128, 1129, 1130, 1131, 1132, 1133, 1134, 1135, 1136, 1137, 1138, 1139, 1140, 1141, 1140, 1141, 1144, 1145, 1146, 1147, 1148, 1149, 1150, 1151, 1152, 1153, 1154, 1155, 1156, 1157, 1158, 1159, 1160, 1161, 1162, 1163, 1164, 1165, 1166, 1167, 1168, 1169, 1170, 1171, 1172, 1173, 1174, 1175, 1176, 1177, 1178, 1179, 1180, 1181, 1182, 1183, 1184, 1185, 1186, 1187, 1188, 1189, 1190, 1191, 1192, 1193, 1194, 1195, 1196, 1197, 1198, 1199, 1200, 1201, 1202, 1203, 1204, 1205, 1206, 1207, 1208, 1209, 1210, 1211, 1212, 1213, 1214, 1215, 1216, 1046, 1078, 1219, 1220, 1221, 1222, 1223, 1224, 1225, 1226, 1227, 1228, 1229, 1230, 1231, 1040, 1072, 1040, 1072, 1236, 1237, 1045, 1077, 1240, 1241, 1240, 1241, 1046, 1078, 1047, 1079, 1248, 1249, 1048, 1080, 1048, 1080, 1054, 1086, 1256, 1257, 1256, 1257, 1069, 1101, 1059, 1091, 1059, 1091, 1059, 1091, 1063, 1095, 1270, 1271, 1067, 1099, 1274, 1275, 1276, 1277, 1278, 1279};

    /* renamed from: d */
    public final CharSequence f4908d;

    /* renamed from: b */
    public volatile boolean f4906b = true;

    /* renamed from: c */
    public final Object f4907c = new Object();

    /* renamed from: e */
    public AtomicBoolean f4909e = new AtomicBoolean(false);

    public AbstractC1533z(CharSequence charSequence) {
        this.f4908d = charSequence;
    }

    /* renamed from: m */
    public static char m951m(char c) {
        char[] cArr = f4905a;
        if (c < cArr.length) {
            c = cArr[c];
        } else if (c == 8217) {
            return '\'';
        }
        return Character.toLowerCase(c);
    }

    /* renamed from: e */
    public void m954e() {
        toString();
        hashCode();
        if (this.f4909e.getAndSet(true)) {
            return;
        }
        synchronized (this.f4907c) {
            try {
                mo501f();
                toString();
                hashCode();
            } catch (Exception e) {
                toString();
                hashCode();
                e.getMessage();
            }
        }
    }

    /* renamed from: f */
    public abstract void mo501f();

    /* renamed from: g */
    public abstract void mo500g(GetWordsCallback getWordsCallback);

    /* renamed from: h */
    public abstract void mo499h(InterfaceC1479j0 interfaceC1479j0, InterfaceC1532y interfaceC1532y);

    /* renamed from: i */
    public final boolean m953i() {
        return this.f4909e.get();
    }

    /* renamed from: j */
    public abstract boolean mo498j(CharSequence charSequence);

    /* renamed from: k */
    public abstract void mo497k();

    /* renamed from: l */
    public void m952l() {
        if (this.f4909e.get()) {
            return;
        }
        synchronized (this.f4907c) {
            this.f4906b = true;
            if (this.f4909e.get()) {
                this.f4906b = false;
                return;
            }
            toString();
            hashCode();
            mo497k();
            toString();
            hashCode();
            this.f4906b = false;
        }
    }

    public String toString() {
        return String.format("%s of %s", getClass().getName(), this.f4908d);
    }
}