package mw.projectred_manipulation.illumination;

import net.minecraft.nbt.NBTTagCompound;
import mw.fmp_manipulation.IMultiPartManipulator;
import mw.fmp_manipulation.DefaultFMPManipulators.Multipart;

public class VerticalFaces extends Multipart {

	private static final byte WEST = 0;
	private static final byte EAST = 1;
	private static final byte NORTH = 2;
	private static final byte SOUTH = 3;
	
	private static final String tagName = "meta";
	
	@Override
	public void rotate90(NBTTagCompound data) {
		switch((int) this.getNumber(tagName, data)) {
		case WEST:
			this.setNumber(tagName, NORTH, data);
			break;
		case EAST:
			this.setNumber(tagName, SOUTH, data);
			break;
		case NORTH:
			this.setNumber(tagName, EAST, data);
			break;
		case SOUTH:
			this.setNumber(tagName, WEST, data);
			break;
		}
	}

	@Override
	public void rotate180(NBTTagCompound data) {
		switch((int) this.getNumber(tagName, data)) {
		case WEST:
			this.setNumber(tagName, EAST, data);
			break;
		case EAST:
			this.setNumber(tagName, WEST, data);
			break;
		case NORTH:
			this.setNumber(tagName, SOUTH, data);
			break;
		case SOUTH:
			this.setNumber(tagName, NORTH, data);
			break;
		}
	}

	@Override
	public void rotate270(NBTTagCompound data) {
		switch((int) this.getNumber(tagName, data)) {
		case WEST:
			this.setNumber(tagName, SOUTH, data);
			break;
		case EAST:
			this.setNumber(tagName, NORTH, data);
			break;
		case NORTH:
			this.setNumber(tagName, WEST, data);
			break;
		case SOUTH:
			this.setNumber(tagName, EAST, data);
			break;
		}
	}

	@Override
	public void mirrorX(NBTTagCompound data) {
		switch((int) this.getNumber(tagName, data)) {
		case WEST:
			this.setNumber(tagName, EAST, data);
			break;
		case EAST:
			this.setNumber(tagName, WEST, data);
			break;
		}
	}

	@Override
	public void mirrorZ(NBTTagCompound data) {
		switch((int) this.getNumber(tagName, data)) {
		case NORTH:
			this.setNumber(tagName, SOUTH, data);
			break;
		case SOUTH:
			this.setNumber(tagName, NORTH, data);
			break;
		}
	}
}
