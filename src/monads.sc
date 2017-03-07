//map

val x = (0 to 4).toList
val x2 = x map { x => x * 3 }
val x3 = x map { _ * 3 }
val x4 = x map { _ * 0.1 }