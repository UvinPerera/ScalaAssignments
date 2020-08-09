import scala.math.sqrt

case class Point(a:Int,b:Int)
{
	var x:Int = a
	var y:Int = b

	def +(obj:Point):Point = Point(this.x+obj.x,this.y+obj.y) // uses + operator as adding points
	def move(dx:Int,dy:Int):Point = { // returns a Point shifted by given amounts
		return Point(this.x+dx,this.y+dy)
	} 
	def distance(point:Point):Double ={ // distance between 2 points
		return sqrt((this.x-point.x)*(this.x-point.x)+(this.y-point.y)*(this.y-point.y))
	}

	def invert():Point = return Point(this.y,this.x) // invert given cordinates

}


object CaseClass {
	  def main(args: Array[String]): Unit = {
	
		var p1 = Point(1,2) // coordinate 1
		var p2 = Point(4,5) // coordinate 2
		println("Point 1:"+p1) // prints point 1
		println("Point 2:"+p2) // prints point 2
		println("Point Add:"+(p1+p2))// adds the two points
		println("Point 2 Move by (dx=1,dy=1):"+p2.move(1,1))//dx=1 dy=1 and shifts point 2
		println("Distance between point 1 and point 2:"+p1.distance(p2)) // distance between (1,2) and(4,5)
		println("Invert Point 2:"+p2.invert)// (x,y)=>(y,x)
		

	
	}
}
