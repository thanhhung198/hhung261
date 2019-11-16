package com.laptrinhjavaweb.buider;

public class BuildingSeachBuilder {
	private String name;
	private String district;
//	private Integer buildingArea;
//	private Integer numberOfBasement;
	private String buildingArea;
	private String numberOfBasement;
//	public Integer getBuildingArea() {
//		return buildingArea;
//	}
//
//	public Integer getNumberOfBasement() {
//		return numberOfBasement;
//	}
	public String getBuildingArea() {
		return buildingArea;
	}

	public String getNumberOfBasement() {
		return numberOfBasement;
	}

	public String getName() {
		return name;
	}

	public String getDistrict() {
		return district;
	}

	private BuildingSeachBuilder(Builder builder) {
		this.name=builder.name;
		this.district=builder.district;
		this.buildingArea=builder.buildingArea;
		this.numberOfBasement=builder.numberOfBasement;
	}

	public static class Builder {
		private String name;
		private String district;
		private String buildingArea;
		private String numberOfBasement;
//		private Integer buildingArea;
//		private Integer numberOfBasement;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setBuildingArea(String buildingArea) {
			this.buildingArea = buildingArea;
			return this;
		}

		public Builder setNumberOfBasement(String numberOfBasement) {
			this.numberOfBasement = numberOfBasement;
			return this;
		}

//		public Builder setBuildingArea(Integer buildingArea) {
//			this.buildingArea = buildingArea;
//			return this;
//		}
//
//		public Builder setNumberOfBasement(Integer numberOfBasement) {
//			this.numberOfBasement = numberOfBasement;
//			return this;
//		}
//
//		

		public Builder setDistrict(String district) {
			this.district = district;
			return this;
		}

		public BuildingSeachBuilder build() {
			return new BuildingSeachBuilder(this);
		}
	}
}
