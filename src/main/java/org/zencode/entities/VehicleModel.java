using System;
using System.Collections.Generic;
using System.Text;

namespace KarveModel
{
    public class VehicleModel
    {
        public VehicleModel()
        {
            Brand = new Brand();
            Group = new Group();
        }
        public Brand Brand { get; set; }
        public string Chassis { get; set; }
        public string Code { get; set; }
        public Group Group { get; set; }
        public string Name { get; set; }
        public string Reference { get; set; }
        public string Variant { get; set; }
        public string Year { get; set; }
        public string CurrentUser { get; set; }
        public string LastModification { get; set; }
    }
}
